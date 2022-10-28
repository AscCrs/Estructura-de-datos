/** Algoritmo de la función de ackerman 
 *  Entrada: Dos números naturales enteros
 *  Salida: Un número natural 
*/
package Recursividad.EjerciciosEnClase.TiposDeRecursividad;
import java.util.Scanner;

public class anidal {
    static int ack(int m, int n) {
        if (m == 0) { // Caso base
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1,1);
        } else {
            return ack(m - 1, ack(m, n-1));
        } 
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int m = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n = sc.nextInt();
        System.out.print("Resultado: " + ack(m, n));

        sc.close();
    }
}
