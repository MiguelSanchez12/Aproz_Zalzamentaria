import java.util.Scanner;
public class TiendaSalsamentaria{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Tienda miTienda = new Tienda("123456", "Zalzamentaria", "Suba");
        String codigo, nombre;
        double precio, cantidad;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar Producto de Carne: ");
            System.out.println("[2]- Adicionar Producto de Salsas: ");
            System.out.println("[3]- Adicionar Producto de Bebida: ");
            System.out.println("[4]- Calcular Promedio de Compras: ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Ingrese el código del producto: ");
                        codigo = sc.next();
                        System.out.println("Ingrese el la marca del producto: ");
                        nombre = sc.next();
                        System.out.println("Ingrese el precio del producto: ");
                        precio = sc.nextDouble();
                        System.out.println("Ingrese la cantidad a llevar: ");
                        cantidad = sc.nextDouble();
                        try{
                            miTienda.adicionarProductoCarne(codigo, nombre, precio, cantidad);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Ingrese el código del producto: ");
                        codigo = sc.next();
                        System.out.println("Ingrese el la marca del producto: ");
                        nombre = sc.next();
                        System.out.println("Ingrese el precio del producto: ");
                        precio = sc.nextDouble();
                        System.out.println("Ingrese la cantidad a llevar: ");
                        cantidad = sc.nextDouble();
                        try{                        
                            miTienda.adicionarProductoSalsa(codigo, nombre, precio, cantidad);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();                        
                        System.out.println("Ingrese el código del producto: ");
                        codigo = sc.next();
                        System.out.println("Ingrese el la marca del producto: ");
                        nombre = sc.next();
                        System.out.println("Ingrese el precio del producto: ");
                        precio = sc.nextDouble();
                        System.out.println("Ingrese la cantidad a llevar: ");
                        cantidad = sc.nextDouble();
                        try{                         
                            miTienda.adicionarProductoBebida(codigo, nombre, precio, cantidad);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miTienda.calcularPromedioPrecios();
                        System.out.println("\nEl promedio de precios es: " + promedio);
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}

