/**
 * Diseñe e implemente un algoritmo que imprima todas las posibles descomposiciones de
 * un número natural como suma de números menores que él (sumas con más de un sumando).
 */
package Recursividad.Proyecto;
import java.util.Scanner;

public class codigo2 {
    public static void descJp(int[] v, int i, int aux) {
        int j, p;
        for (j = i; j >= 1; j--) {
            if (j <= v[aux - 1]) {
                v[aux] = j;
                if (j == i) {
                    System.out.print(v[0] + " = " + v[1]);
                    for (p = 2; p <= aux; p++) {
                        System.out.print(" + " + v[p]);
                    }
                    System.out.println("");
                } else descJp(v, i - j, aux + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int []v = new int[50]; 
        System.out.println("Ingrese un número entero positivo: ");
        n = sc.nextInt();
        v[0] = n;

        System.out.println("Resultado de la descomposición:");
        descJp(v, n, 1);
        sc.close();
    }
}
