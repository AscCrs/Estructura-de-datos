/** Crear una matriz de NxN que permita la entrada y salida de datos */
package Arreglos;
import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // !1

        int f = 0, c = 0; // Las variables f y c denotan la cantidad de filas y columnas del arreglo
        int [][]arreglo; // ! 1

        System.out.print("Ingrese la cantidad de filas que quiere que tenga el arreglo: "); // ! 1
        f = sc.nextInt();
        System.out.print("Ingrese la cantidad de columnas que quiere que tenga el arreglo: ");
        c = sc.nextInt();
        arreglo = new int[f][c];

        for (int i = 0; i < f; i++) { // ! n
            for (int j = 0; j < c; j++) { // ! nxn n¨2
                System.out.print("Ingrese el dato en la fila: " + (i + 1) + " columna " + (j + 1) + ": "); // ! n¨2
                arreglo[i][j] = sc.nextInt(); // ! n¨2
            }
        }

        try { // 1
            Thread.sleep(1500); // 1
            System.out.println("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) { // n¨2
                System.out.println("El valor almacenado en fila " + (i + 1) + " columna " + (j + 1) + " es: " + arreglo[i][j]);
            }
        }
        //  3n + 14
        // ! O(n¨2)
        // ! O(1)
        sc.close();
    }
}
