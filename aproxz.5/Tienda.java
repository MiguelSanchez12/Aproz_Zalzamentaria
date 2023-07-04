public class Tienda {
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private ProductoCarne[] productosCarne;
    private ProductoSalsa[] productosSalsa;
    private ProductoBebida[] productosBebida;
    private int numProductosCarne;
    private int numProductosSalsa;
    private int numProductosBebida;

    public Tienda(String nit, String nombreTienda, String direccion) {
        if (nit != null) {
            this.nit = nit;
        } else {
            this.nit = "";
        }
        setNombreTienda(nombreTienda);
        setDireccion(direccion);
        productosCarne = new ProductoCarne[50];
        productosSalsa = new ProductoSalsa[50];
        productosBebida = new ProductoBebida[50];
        numProductosCarne = 0;
        numProductosSalsa = 0;
        numProductosBebida = 0;
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

    public int getNumProductosCarne() {
        return numProductosCarne;
    }

    public int getNumProductosSalsa() {
        return numProductosSalsa;
    }

    public int getNumProductosBebida() {
        return numProductosBebida;
    }

    public double calcularPromedioPrecios() {
        double promedio = 0;
        for (int i = 0; i < numProductosCarne; i++) {
            promedio += productosCarne[i].getPrecio();
        }
        for (int i = 0; i < numProductosSalsa; i++) {
            promedio += productosSalsa[i].getPrecio();
        }
        for (int i = 0; i < numProductosBebida; i++) {
            promedio += productosBebida[i].getPrecio();
        }
        int totalProductos = numProductosCarne + numProductosSalsa + numProductosBebida;
        if (totalProductos > 0) {
            promedio /= totalProductos;
        }
        return promedio;
    }

    public void agregarProductoCarne(String codigo, String nombre, double precio, double cantidad) {
        productosCarne[numProductosCarne] = new ProductoCarne(codigo, nombre, precio, cantidad);
        numProductosCarne++;
    }

    public void agregarProductoSalsa(String codigo, String nombre, double precio, double cantidad) {
        productosSalsa[numProductosSalsa] = new ProductoSalsa(codigo, nombre, precio, cantidad);
        numProductosSalsa++;
    }

    public void agregarProductoBebida(String codigo, String nombre, double precio, double cantidad) {
        productosBebida[numProductosBebida] = new ProductoBebida(codigo, nombre, precio, cantidad);
        numProductosBebida++;
    }
}
