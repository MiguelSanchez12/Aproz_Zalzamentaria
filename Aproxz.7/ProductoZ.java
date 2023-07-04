public abstract class ProductoZ{
    protected final String codigo;
    private String nombre;
    
    public ProductoZ(String codigo, String nombre)throws Exception{
      if(codigo.trim().equals(""))
          throw new Exception("valor invalido en la codigo");
      if(codigo.matches(".*[a-zA-Z].*"))
                throw new Exception("La identificacion no puede tener caracteres");
            
            this.codigo = codigo;
            setNombre(nombre);
    }
    public abstract double getPrecio ();
    
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


