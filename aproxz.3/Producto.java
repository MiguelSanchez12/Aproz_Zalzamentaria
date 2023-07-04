
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null)
            this.codigo = codigo;
        else
            this.codigo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "";
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
        else
            this.precio = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0)
            this.cantidad = cantidad;
        else
            this.cantidad = 0;
    }

    Producto(String codigo, String nombre, double precio, int cantidad) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    double calcularPromedio() {
        return precio * cantidad;
    }
}
