
/**
 * Write a description of class z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Salsamentaria {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int numProductos;
        Producto[] losProductos = new Producto[50];
        String codigo, nombre;
        double precio;
        int cantidad;
        double promedio = 0;

        System.out.println("Digite el número de productos: ");
        numProductos = sc.nextInt();

        for (int i = 0; i < numProductos; i++) {
            System.out.println("Digite el código del producto: ");
            codigo = sc.next();
            System.out.println("Digite el nombre del producto: ");
            nombre = sc.next();
            System.out.println("Digite el precio del producto: ");
            precio = sc.nextDouble();
            System.out.println("Digite la cantidad a llevar: ");
            cantidad = sc.nextInt();

            Producto unProducto = new Producto(codigo, nombre, precio, cantidad);
            losProductos[i] = unProducto;
        }

        for (int i = 0; i < numProductos; i++)
            promedio = promedio + losProductos[i].calcularPromedio() / numProductos;

        System.out.println("\nEl promedio de precios es: " + promedio);

        sc.close();
    }
}
