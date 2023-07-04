
public class ProductoSalsa extends ProductoZ {
    private double precio;
    private double cantidad;

    public ProductoSalsa(String codigo, String nombre, double precio, double cantidad)throws Exception{
    super (codigo, nombre);
    setPrecio(precio);
    setCantidad(cantidad);
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