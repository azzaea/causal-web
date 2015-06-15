<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<jsp:useBean id="date" class="java.util.Date" />
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>CCD: Basic Setup</title>
        <meta name="description" content="" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="${path}/vendor/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" href="${path}/vendor/bootstrap/css/bootstrap-theme.min.css" />
        <link rel="stylesheet" href="${path}/css/styles.css" />
        <link rel="stylesheet" href="css/setup.css" />
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h3>Center for Casual Discovery</h3>
                    <div class="panel panel-pitt">
                        <div class="panel-heading">
                            <h3 class="panel-title">User Profile Setup</h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="center-block">
                                    <img class="profile-img" src="img/login-user.png" alt="profile picture" />
                                </div>
                            </div>
                            <div class="row">
                                <c:if test="${not empty errorMsg}">
                                    <div class="alert alert-danger text-center" role="alert">${errorMsg}</div>
                                </c:if>
                            </div>
                            <div class="row">
                                <div class="col-lg-12">
                                    <form:form id="userSetup" method="POST" action="${path}/setup" modelAttribute="person" role="form" >
                                        <div class="form-group">
                                            <label for="firstName">First Name:</label>
                                            <form:input path="firstName" id="firstName" class="form-control" type="text" value="${person.firstName}" required="required" autofocus="autofocus" />
                                        </div>
                                        <div class="form-group">
                                            <label for="lastName">Last Name:</label>
                                            <form:input path="lastName" id="lastName" class="form-control" type="text" value="${person.lastName}" required="required" />
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Email:</label>
                                            <form:input path="email" id="email" class="form-control" type="text" value="${person.email}" required="required" />
                                        </div>
                                        <div class="form-group">
                                            <label for="workspaceDirectory">Workspace Directory:</label>
                                            <form:input path="workspaceDirectory" id="workspaceDirectory" class="form-control" type="text" value="${person.workspaceDirectory}" required="required" />
                                        </div>
                                        <div class="form-group">
                                            <input type="submit" class="btn btn-lg btn-block btn-pitt" value="Submit">
                                        </div>
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="text-center">
                    <p class="text-muted">Copyright &copy; <fmt:formatDate value="${date}" pattern="yyyy" /> ${ccd.copyright}</p>
                </div>
            </div>
        </div>
        <script src="${path}/vendor/jquery/jquery-2.1.3.min.js"></script>
        <script src="${path}/vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="${path}/vendor/jquery/jquery.validate.min.js"></script>
        <script src="${path}/js/setup.js"></script>
    </body>
</html>
