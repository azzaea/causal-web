$(document).ready(function () {
    $('[data-toggle=tooltip]').tooltip();

    $('#file_table').DataTable({
        'order': [[2, 'desc']],
        responsive: true,
        'lengthMenu': [[10, 25, 50, 100, -1], [10, 25, 50, 100, 'All']],
        'columnDefs': [
            {'orderable': false, 'bSearchable': false, 'className': 'dt-body-center', 'targets': 0},
            {'orderable': false, 'bSearchable': false, 'targets': 3}
        ]
    });
    $('#select_all').change(function () {
        $('input[type="checkbox"]').not('[disabled]').prop('checked', $(this).prop('checked'));
    });
});
$('#confirm-delete').on('show.bs.modal', function (e) {
    $('.btn-ok').attr('href', 'delete');
});
$('#delete_btn').click(function () {
    if ($('input[type="checkbox"]:checkbox:checked').length === 0) {
        $('#errorSelection').modal('show');
    } else {
        $('#confirm-delete').modal('show');
    }
});
