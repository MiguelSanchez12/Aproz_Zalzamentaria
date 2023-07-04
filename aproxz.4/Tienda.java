public class Tienda {
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private Producto[] productos;
    private int numProductos;

    public Tienda(String nit, String nombreTienda, String direccion) {
        if (nit != null)
            this.nit = nit;
        else
            this.nit = "";
        setNombreTienda(nombreTienda);
        setDireccion(direccion);
        productos = new Producto[50];
        numProductos = 0;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        if (nombreTienda != null) {
            this.nombreTienda = nombreTienda;
        } else {
            this.nombreTienda = "";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            this.direccion = "";
        }
    }

    public int getNumProductos() {
        return numProductos;
    }

    public double calcularPromedioPrecios() {
        double promedio = 0;
        for (int i = 0; i < numProductos; i++) {
            promedio += productos[i].getPrecio() / numProductos;
        }
        return promedio;
    }

    public void adicionarProducto(String codigo, String nombre, double precio, double cantidad) {
        Producto p = new Producto(codigo, nombre, precio, cantidad);
        productos[numProductos] = p;
        numProductos++;
    }
}
