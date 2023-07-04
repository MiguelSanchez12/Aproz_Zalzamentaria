
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto {
    String codigo;
    String nombre;
    double precio;
    double cantidad;

    public Producto(String codigo, String nombre, double precio, double cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCantidad() {
        return cantidad;
    }
}
