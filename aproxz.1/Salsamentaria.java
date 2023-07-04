
/**
 * Write a description of class S here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Salsamentaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroProductos = 0, opcionMenu = 0;
        Producto[] productos = new Producto[50];
        String codigo, nombre;
        double precio, cantidad;
        double promedio = 0;

        while (opcionMenu != 3) {
            System.out.println("\nMenu de Opciones:");
            System.out.println("1. Agregar un Producto");
            System.out.println("2. Calcular Promedio de Compras");
            System.out.println("3. Salir");
            System.out.println("Escoja una opción...");
            opcionMenu = sc.nextInt();

            if (opcionMenu == 1) {
                System.out.println("Digite el código del Producto:");
                codigo = sc.next();
                System.out.println("Digite el nombre del Producto:");
                nombre = sc.next();
                System.out.println("Digite el precio del Producto:");
                precio = sc.nextDouble();
                System.out.println("Digite la cantidad del Producto:");
                cantidad = sc.nextDouble();

                Producto producto = new Producto(codigo, nombre, precio, cantidad);
                productos[numeroProductos] = producto;
                numeroProductos++;
            } else if (opcionMenu == 2) {
                promedio = 0;
                double totalCompras = 0;
                double totalProductos = 0;

                for (int i = 0; i < numeroProductos; i++) {
                    totalCompras += productos[i].getPrecio() * productos[i].getCantidad();
                    totalProductos += productos[i].getCantidad();
                }

                if (totalProductos > 0) {
                    promedio = totalCompras / totalProductos;
                }

                System.out.println("\nEl Promedio de compras en la Salsamentaria es: " + promedio);
            }
        }

        sc.close();
    }
}

