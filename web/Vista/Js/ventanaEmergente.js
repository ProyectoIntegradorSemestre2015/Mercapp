
;(function($) {
         // Cuando la página esté cargada
        $(function() {
            // Evento click
            $('#anadir_promocion').on('click', function(e) {
                // Prevenir la acción por defecto
                e.preventDefault();
                // Se lanza el método bPopup 
                $('#formulario_anadir').bPopup();
                  document.getElementById('formulario_anadir').style.visibility='visible';
            });
        });
    })(jQuery);