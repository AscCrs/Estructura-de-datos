/**Crear un programa que lea un arreglo de 30 posiciones
 * con entrada y salida de datos
 */
package Arreglos;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int []arreglo = new int[30];

        for(int i = 0; i < 30; i++) {
            System.out.print("Ingrese el dato " + (i+1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(arreglo[i]);
        }

        entrada.close();
    }
}