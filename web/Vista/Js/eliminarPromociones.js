$(function() {


    // Cuando la página esté cargada

    // Evento click
    $('#consultar_promocion').on('click', function(e) {
        alert("Hola");
        $.ajax({
            type: "POST",
            url: "../eliminarPromociones.jsp",
            success: function(html) {
                $('#promocionUno').html(html);
                alert(html);

            },
            beforeSend: function() {
            }
        });


    });



});