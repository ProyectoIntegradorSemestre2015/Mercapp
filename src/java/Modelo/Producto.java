
package Modelo;


public class Producto {
    private String codigo_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private String medida_producto;
    private boolean notificacion;

    public Producto() {
    }

    public Producto(String codigo_producto, String nombre_producto, String descripcion_producto, String medida_producto, boolean notificacion) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.medida_producto = medida_producto;
        this.notificacion = notificacion;
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
     * @return the nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * @param nombre_producto the nombre_producto to set
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    /**
     * @return the descripcion_producto
     */
    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    /**
     * @param descripcion_producto the descripcion_producto to set
     */
    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
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
     * @return the notificacion
     */
    public boolean isNotificacion() {
        return notificacion;
    }

    /**
     * @param notificacion the notificacion to set
     */
    public void setNotificacion(boolean notificacion) {
        this.notificacion = notificacion;
    }
    
    
}
