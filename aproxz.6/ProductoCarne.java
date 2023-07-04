public class ProductoCarne extends ProductoZ {
    private double precio;
    private double cantidad;

    public ProductoCarne(String codigo, String nombre, double precio, double cantidad){
    super (codigo, nombre);
    setNombre(nombre);
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