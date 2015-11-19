package Modelo;

import Controlador.Conexion;
import java.sql.SQLException;
import java.util.Date;

public class GestorBDPromocion extends Promocion {

    Controlador.Conexion con;

    public GestorBDPromocion() {
        con = new Controlador.Conexion();
    }

    public GestorBDPromocion(String codigo_producto, String tipo_promocion, Date inicio_promocion, Date fin_promocion, String descripcion, String lugar_promocion, int peso_producto, String medida_producto) {
        super(codigo_producto, tipo_promocion, inicio_promocion, fin_promocion, descripcion, lugar_promocion, peso_producto, medida_producto);
        con = new Controlador.Conexion();
    }       

    public String insertar() {
        
        try {
            String sql = "INSERT INTO promocion(codigo_producto, tipo_promocion, inicio_promocion,fin_promocion, descripcion, lugar_promocion, peso_producto, medida_producto)"
                    + " VALUES ('"+super.getCodigo_producto()+"',"
                    + "'"+super.getTipo_promocion()+"','"+super.getInicio_promocion()+"','"+super.getFin_promocion()+"',"
                    + " '"+super.getDescripcion()+"','"+super.getLugar_promocion()+"','"+super.getPeso_producto()+"',"
                    + "'"+super.getMedida_producto()+"')";
            con.procesaSQL(sql);
            return "INFORMACION REGISTRADA EN LA BASE DE DATOS CORRECTAMENTE";

        } catch (Exception ex) {
            System.out.println("Error sql en la capa de negocios " + ex.toString());
        }
        //String sql2="INSERT INTO tbl_login(contrasena,)";
        return "No se inserto";
    }
    
    public StringBuffer consultar() {
        StringBuffer sb = new StringBuffer();
        StringBuffer nb = new StringBuffer();
        try {

            String sql = "SELECT tipo_promocion, inicio_promocion," +
                    "     fin_promocion, descripcion, lugar_promocion, peso_producto, medida_producto" +
                    "     FROM promocion;";
            java.sql.ResultSet rs = null;
            rs = con.procesaSQLConsulta(sql);
            sb.append("<TABLE id='tabla_prod' style='border-style:solid;border-color:#f44a04' margin: 10px 10px 10px 10px;>");
            while (rs.next()) {
                sb.append("<TR>");
                sb.append("<TD>Tipo promocion: </TD>");
                sb.append("<TD>").append(rs.getString(3)).append("</TD>");
                sb.append("</TR>");
                sb.append("<TR>");
                sb.append("<TD>inicio_promoción: </TD>");
                sb.append("<TD>").append(rs.getString(4)).append("</TD>");
                sb.append("</TR>");
                sb.append("<TR>");
                sb.append("<TD>fin promocion: </TD>");
                sb.append("<TD>").append(rs.getString(5)).append("</TD>");
                sb.append("</TR>");
                sb.append("<TR>");
                sb.append("<TD>Descripcion: </TD>");
                sb.append("<TD>").append(rs.getString(6)).append("</TD>");
                sb.append("</TR>");
                
                // sb.append("<TD>");
                //sb.append("<img src='../../imagenes/" + rs.getString() + "' width=\"100\" height=\"100\">");
                // sb.append("</TD>");
                sb.append("</TR>");
            }

            sb.append("</TABLE>");
        } catch (SQLException ex) {
            //System.out.println("ERROR en el sql");
        }
        return sb;
    }

}
