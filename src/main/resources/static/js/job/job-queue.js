var job_queue_tbl = $('#job_queue_tbl').DataTable({
    pageLength: 10,
    responsive: true,
    "aoColumns": [
        {"mData": "name"},
        {"mData": "creationTime"},
        {"mData": "status"}
    ],
    "columnDefs": [
        {"width": "0", "className": "text-center", "targets": 1},
        {"width": "0", "className": "text-center", "targets": 2},
        {"orderable": false, "bSearchable": false, "width": "0", "className": "text-center", "targets": 3},
        {"orderable": false, "bSearchable": false, "width": "0", "className": "text-center", "targets": 4}
    ],
    "order": [[1, "desc"]]
});
$('body').tooltip({selector: '[data-toggle="tooltip"]'});