package Recursividad.EjerciciosEnClase;
import java.util.Scanner;

public class fibonacciSinRecursividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fib = 1, n = 0;
        System.out.print("Ingrese el limite de terminos de la secuencia de fibonacci: ");
        n = sc.nextInt();
        if (n == 0) fib = 1;
        int rst[] = {1, 2};
        if (n < 3) fib = rst[n-1];
        int a1=1,a2=2;
        for(int i = 3;i <= n; i++){
            fib = a1 + a2;
            a1 = a2; // Mueve estos dos "punteros" hacia atrás cada vez
            a2 = fib;
        }

        System.out.println("El termino es: " + fib);

        sc.close();
    }
}