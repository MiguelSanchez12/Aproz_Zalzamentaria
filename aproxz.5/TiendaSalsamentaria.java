import java.util.Scanner;

public class TiendaSalsamentaria {
    public static void main(String Args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Tienda miTienda = new Tienda("123456", "Zalzamentaria", "Suba");

        String codigo, nombre;
        double precio, cantidad;

        double promedio = 0;

        System.out.println("Ingrese el número de productos de carne: ");
        int numProductosCarne = sc.nextInt();
        for (int i = 0; i < numProductosCarne; i++) {
            System.out.println("Ingrese el código del producto: ");
            codigo = sc.next();
            System.out.println("Ingrese el la marca del producto: ");
            nombre = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad a llevar: ");
            cantidad = sc.nextDouble();
            miTienda.agregarProductoCarne(codigo, nombre, precio, cantidad);
        }

        System.out.println("Ingrese el número de productos de salsa: ");
        int numProductosSalsa = sc.nextInt();
        for (int i = 0; i < numProductosSalsa; i++) {
            System.out.println("Ingrese el código del producto: ");
            codigo = sc.next();
            System.out.println("Ingrese el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad a llevar: ");
            cantidad = sc.nextDouble();
            miTienda.agregarProductoSalsa(codigo, nombre, precio, cantidad);
        }

        System.out.println("Ingrese el número de productos de bebida: ");
        int numProductosBebida = sc.nextInt();
        for (int i = 0; i < numProductosBebida; i++) {
            System.out.println("Ingrese el código del producto: ");
            codigo = sc.next();
            System.out.println("Ingrese el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad a llevar: ");
            cantidad = sc.nextDouble();
            miTienda.agregarProductoBebida(codigo, nombre, precio, cantidad);
        }

        promedio = miTienda.calcularPromedioPrecios();
        System.out.println("\nEl promedio de precios es: " + promedio);
    }
}
