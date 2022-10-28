/**
 * Factorial pero utilizando recursividad de cola
 */
package Recursividad.EjerciciosEnClase.TiposDeRecursividad;
import java.util.Scanner;

public class deCola {
    static int fact(int n) {
        return colaFact(n, 1);
    }
    static int colaFact(int n, int a) {
        if (n == 0) return a;
        else return colaFact(n - 1, n * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el factorial a calcular: ");
        int n = sc.nextInt();
        System.out.println("El factorial es: " + fact(n));

        sc.close();
    }
}
