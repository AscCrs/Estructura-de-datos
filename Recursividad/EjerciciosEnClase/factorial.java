/** Calculo de un número n factorial */
package Recursividad.EjerciciosEnClase;
import java.util.Scanner;

public class factorial {
    public static int fact(int a) {
        if (a <= 1) {
            return 1;
        } else {
            return a * fact(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero a calcular: ");
        int a = sc.nextInt();
        System.out.println("El factorial de " + a + " es: " + fact(a));

        sc.close();
    }
}
