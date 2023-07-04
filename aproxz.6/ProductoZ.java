public class ProductoZ
{
    protected final String codigo;
    private String nombre;
    
    public ProductoZ(String codigo, String nombre){
      if(codigo != null)this.codigo  = codigo;
      else this.codigo = ""; 
      setNombre(nombre);
    }
    double getPrecio () {
        return  0;
    }
    public String getCodigo (){
       return codigo;
    }
       public String getNombre (){
       return nombre;
    }
    
    public void setNombre (String nombre){
        if(nombre != null ) this.nombre = nombre;
        else this.nombre = "";
    }
    
}


