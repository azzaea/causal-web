$(document).ready(function () {
    $('#password_reset').validate({
        rules: {
            password: {
                minlength: 4,
                maxlength: 10,
                nowhitespace: true,
                required: true
            },
            confirmPassword: {
                equalTo: "#password"
            }
        },
        messages: {
            password: "Please enter valid a password (4-10 chars).",
            confirmPassword: "Please re-enter your password.",
        },
        highlight: function (element) {
            $(element).closest('.form-group').addClass('has-error');
        },
        unhighlight: function (element) {
            $(element).closest('.form-group').removeClass('has-error');
        },
        errorElement: 'span',
        errorClass: 'help-block',
        errorPlacement: function (error, element) {
            if (element.parent('.input-group').length) {
                error.insertAfter(element.parent());
            } else {
                error.insertAfter(element);
            }
        }
    });
});
