public class ProductoCarne {
    private final String codigo;
    private String nombre;
    private double precio;
    private double cantidad;

    public ProductoCarne(String codigo, String nombre, double precio, double cantidad) {
        if (codigo != null) {
            this.codigo = codigo;
        } else {
            this.codigo = "";
        }
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public String getCodigo() {
        return codigo;
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
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }
}

