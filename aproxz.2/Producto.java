
/**
 * Write a description of class x here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private double cantidad;

    public Producto(String codigo, String nombre, double precio, double cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null) {
            this.codigo = codigo;
        } else {
            this.codigo = "";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
