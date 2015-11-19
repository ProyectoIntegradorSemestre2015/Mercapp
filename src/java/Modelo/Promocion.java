package Modelo;

import java.util.Date;
import sun.util.calendar.BaseCalendar;

public class Promocion {
    /*

     tipo_promocion character varying,
     inicio_promocion date,
     fin_promocion date,
     descripcion character varying,
     lugar_promocion character varying,
     peso_producto integer,
     medida_producto character varying,
     */

    private String codigo_producto;
    private String tipo_promocion;
    private Date inicio_promocion;
    private Date fin_promocion;
    private String descripcion;
    private String lugar_promocion;
    private int peso_producto;
    private String medida_producto;
    Controlador.Conexion con = new Controlador.Conexion();

    public Promocion() {
    }

    public Promocion(String codigo_producto, String tipo_promocion, Date inicio_promocion, Date fin_promocion, String descripcion, String lugar_promocion, int peso_producto, String medida_producto) {
        this.codigo_producto = codigo_producto;
        this.tipo_promocion = tipo_promocion;
        this.inicio_promocion = inicio_promocion;
        this.fin_promocion = fin_promocion;
        this.descripcion = descripcion;
        this.lugar_promocion = lugar_promocion;
        this.peso_producto = peso_producto;
        this.medida_producto = medida_producto;
    }

    /**
     * @return the inicio_promocion
     */
    public Date getInicio_promocion() {
        return inicio_promocion;
    }

    /**
     * @param inicio_promocion the inicio_promocion to set
     */
    public void setInicio_promocion(Date inicio_promocion) {
        this.inicio_promocion = inicio_promocion;
    }

    /**
     * @return the fin_promocion
     */
    public Date getFin_promocion() {
        return fin_promocion;
    }

    /**
     * @param fin_promocion the fin_promocion to set
     */
    public void setFin_promocion(Date fin_promocion) {
        this.fin_promocion = fin_promocion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the lugar_promocion
     */
    public String getLugar_promocion() {
        return lugar_promocion;
    }

    /**
     * @param lugar_promocion the lugar_promocion to set
     */
    public void setLugar_promocion(String lugar_promocion) {
        this.lugar_promocion = lugar_promocion;
    }

    /**
     * @return the peso_producto
     */
    public int getPeso_producto() {
        return peso_producto;
    }

    /**
     * @param peso_producto the peso_producto to set
     */
    public void setPeso_producto(int peso_producto) {
        this.peso_producto = peso_producto;
    }

    /**
     * @return the medida_producto
     */
    public String getMedida_producto() {
        return medida_producto;
    }

    /**
     * @param medida_producto the medida_producto to set
     */
    public void setMedida_producto(String medida_producto) {
        this.medida_producto = medida_producto;
    }

    /**
     * @return the codigo_producto
     */
    public String getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @return the tipo_promocion
     */
    public String getTipo_promocion() {
        return tipo_promocion;
    }

    /**
     * @param tipo_promocion the tipo_promocion to set
     */
    public void setTipo_promocion(String tipo_promocion) {
        this.tipo_promocion = tipo_promocion;
    }

}
