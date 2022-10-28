/**Crear una matriz de 5x5.
 * El programa debe tener entrada y salida de datos.
 */
package Arreglos;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][]arreglo = new int[5][5]; // Creación de una matriz de 5x5
 
        for (int i = 0; i < 5; i++) { // Ciclo que recorre las filas de la matriz
            for (int j = 0; j < 5; j++) { // Ciclo que recorre las columnas de la matriz
                System.out.print("Ingresa el valor de la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                arreglo[i][j] = sc.nextInt();
            }
        }

        try {
            Thread.sleep(3000);
            for (int i = 0; i < 30; i++) {
                System.out.print("-");
            } 
            System.out.println("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) { // Ciclo que imprime las filas de la matriz
            for (int j = 0; j < 5; j++) { // Ciclo que imprime las columnas de la matriz
                System.out.println("Valor en la posicion: " + i + ", " + j + ": " + arreglo[i][j]);
            }
        }
        sc.close();
    }
}
