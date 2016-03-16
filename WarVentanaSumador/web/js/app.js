var isNew;
$(document).ready(function () {
    $("#sumar").click(function (event) {
        sumar();
    });
});

function sumar() {
    var a = $('#a').val().trim();
    var b = $('#b').val().trim();
    if (a && b) {
        $.ajax({
            url: 'Servlet',
            type: 'GET',
            data: $("#formsuma").serialize(),
            //data: {param1: a, param2: b},
            success: function (data) {
                $('#resultado').text('El resultado es ' + data);
            },
            error: function (xhr, status) {
                alert('Problemas en la conexion:' + xhr.responseText);
            },
        });
    } else {
        alert('Los numeros no pueden ser vacios');
        return false;
    }
}