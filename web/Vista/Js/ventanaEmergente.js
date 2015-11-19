
$(function() {


    // Cuando la página esté cargada

    // Evento click
    $('#anadir_promocion').on('click', function(e) {
        // Prevenir la acción por defecto
        e.preventDefault();

        // Se lanza el método bPopup 
        $('#formulario_anadir').bPopup();
        document.getElementById('formulario_anadir').style.visibility = 'visible';


        $('#cancelar_promocion').on('click', function(e) {
            
            //document.getElementsByClassName(".b-modal __b-popup1__").style.opacity = 0.1;
           // $(".b-modal").css("opacity",0);
            $('#formulario_anadir').fadeOut('slow');
        });

  
  
    });



});