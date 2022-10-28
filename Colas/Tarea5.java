/** Crear un programa que permita trabajar con una cola.
 *  Debe haber entrada y salida de datos
 */
package Colas;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue; // Clase utilizada para crear una cola

public class Tarea5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queue<String> cola = new LinkedList<String>(); // Objeto utilizado para crear la cola
        int opc = 0;
        String cancion;
        boolean vVal = true;

        do {
            System.out.println("Menu de opciones:\n1.Agregar a la cola\n2.Eliminar el primer elemento de la cola\n3.Terminar");
            System.out.print("Ingrese su opción: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Ingrese la canción para añadir a la cola: ");
                    cancion = sc.next();
                    try {
                        cola.add(cancion);
                        Thread.sleep(1200);
                        System.out.println("\nCanción agregada con éxito!\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        cola.remove();
                        Thread.sleep(1200);
                        System.out.println("\nCanción eliminada con éxito!\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3: 
                    vVal = false; 
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
                    break;
            }
        } while (vVal == true);

        System.out.println("Su cola de canciones es: " + cola);
        sc.close();
    }
}
