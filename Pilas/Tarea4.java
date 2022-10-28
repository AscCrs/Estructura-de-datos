/** Crear un programa que permita trabajar con una pila.
 *  Debe haber entrada y salida de datos
 */
package Pilas;
import java.util.Stack; // Clase usada para crear la pila 
import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <String> carrito = new Stack<String>(); // Objeto utilizado de la clase pila

        boolean vBand = false; 
        String producto;
        char val;
        int opc = 0;

        System.out.println("Menú de opciones: \n1.Agregar un producto al carrito\n2.Eliminar Producto\n3.Salir");
        do {
            System.out.print("Ingrese su opcion: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    producto = sc.next();
                    carrito.push(producto);
                    break;
                case 2: 
                    System.out.print("Desea eliminar un producto del carrito de compras? S/N: ");
                    val = sc.next().charAt(0);
                    if (val == 'S' || val == 's') {
                        try {
                            carrito.pop();
                            Thread.sleep(1500);
                            System.out.println("Producto eliminado correctamente!");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } 
                    break;
                case 3:
                    vBand = true;
                    break;
                default:
                    System.out.println("Esa no es una opcion valida!");
                    break;
            }
        } while (vBand == false);

        System.out.println("Los productos en su carrito de compras son: " + carrito);

        sc.close();
    }
}
