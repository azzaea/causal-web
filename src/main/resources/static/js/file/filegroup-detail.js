$("#detail_edit_btn").click(function () {
    $("#view_detail").hide();
    $("#edit_detail").show();
    $('#name').focus();
});
$("#detail_cancel_btn").click(function () {
    $("#view_detail").show();
    $("#edit_detail").hide();
});
$("#file_edit_btn").click(function () {
    $("#view_file").hide();
    $("#edit_file").show();
});
$("#file_cancel_btn").click(function () {
    $("#view_file").show();
    $("#edit_file").hide();
});

$('#file_tbl').DataTable({
    pageLength: 10,
    responsive: true,
    "columnDefs": [
        {"type": 'file-size', "width": "10%", "targets": 1},
        {"width": "10%", "targets": 2},
        {"orderable": false, "bSearchable": false, "width": "0", "className": "text-center", "targets": 3}
    ],
    "order": [[2, "asc"]]
});

var var_types = $('input:radio[name="varTypeId"]');
for (i = 1; i <= var_types.length; i++) {
    $('#filegroup_' + i).bootstrapDualListbox();
}
$(".datagroup").hide();

var_types.click(function () {
    var val = $(this).val();
    var selectOpt = $('#datagroup_' + val);

    $(".datagroup").not(selectOpt).hide();
    selectOpt.show();
});

$(document).ready(function () {
    $('input:radio[name="varTypeId"]:checked').click();

    $('#fileGroupDetailForm').validate({
        rules: {
            name: {
                required: true
            }
        },
        messages: {
            name: "Please enter a name for the file group."
        },
        highlight: function (element) {
            $(element).closest('.form-group').addClass('has-error');
        },
        unhighlight: function (element) {
            $(element).closest('.form-group').removeClass('has-error');
        }
    });
});
