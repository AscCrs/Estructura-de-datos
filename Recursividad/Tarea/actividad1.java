/** Multiplicación de dos números enteros a traves de recursividad
 *! La entrada es para números no negativos
 *! Salida: el producto de dos números enteros
 */
package Recursividad.Tarea;
import java.util.Scanner;

public class actividad1 {
    public static int mult(int a, int b) {
        if (b == 0) return 0; // Caso base
        else return a + mult(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.println(a + " x " + b +" = " + mult(a, b));

        sc.close();        
    }
}
