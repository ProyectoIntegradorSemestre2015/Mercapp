<%
    Modelo.GestorBDPromocion obj = new  Modelo.GestorBDPromocion();
    String resultado="no";
    if (resultado == "NO") {
        out.print("No hay datos actualmente para mostar");
    }
    else{
        out.print(obj.consultar());
    }
%>
