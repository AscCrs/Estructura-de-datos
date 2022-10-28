/** Secuencia de Fibonacci con recursividad */
package Recursividad.EjerciciosEnClase;
import java.util.Scanner;

public class fibonacci {
    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el limite de terminos de fibonacci: ");
        int n = sc.nextInt();
        System.out.println("El termino es " + fib(n));

        sc.close();
    }
}
