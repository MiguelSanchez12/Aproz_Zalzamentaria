import java.util.ArrayList;
public class Tienda {
    private final String nit;
    private String nombreTienda;
    private String direccion;
    private ArrayList productoz;

    public Tienda(String nit, String nombreTienda, String direccion) {
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNombreTienda(nombreTienda);
        setDireccion(direccion);
        productoz = productoz = new ArrayList();
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
        for (int i = 0; i < productoz.size(); i++) {
            promedio += ((ProductoZ)productoz.get(i)).getPrecio();
        }
        return promedio;
    }

    public void adicionarProductoCarne(String codigo, String nombre, double precio, double cantidad)throws Exception{
        productoz.add(new ProductoCarne(codigo, nombre, precio, cantidad));
    }

    public void adicionarProductoSalsa(String codigo, String nombre, double precio, double cantidad)throws Exception{
        productoz.add(new ProductoSalsa(codigo, nombre, precio, cantidad));
    }

    public void adicionarProductoBebida(String codigo, String nombre, double precio, double cantidad)throws Exception{
        productoz.add(new ProductoBebida(codigo, nombre, precio, cantidad));
    }
}