
public class Tienda {
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private ProductoZ[] productoz;
    private int numProductoZ;

    public Tienda(String nit, String nombreTienda, String direccion) {
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNombreTienda(nombreTienda);
        setDireccion(direccion);
        productoz = new ProductoZ[50];
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
  
    public double calcularPromedioPrecios() {
        double promedio = 0;
        for (int i = 0; i < numProductoZ; i++) {
            promedio += productoz[i].getPrecio();
        }
        return promedio;
    }

    public void agregarProductoCarne(String codigo, String nombre, double precio, double cantidad) {
        productoz[numProductoZ] =new ProductoCarne(codigo, nombre, precio, cantidad);
    }

    public void agregarProductoSalsa(String codigo, String nombre, double precio, double cantidad) {
        productoz[numProductoZ] =new ProductoSalsa(codigo, nombre, precio, cantidad);
    }

    public void agregarProductoBebida(String codigo, String nombre, double precio, double cantidad) {
        productoz[numProductoZ] =new ProductoBebida(codigo, nombre, precio, cantidad);
    }
}