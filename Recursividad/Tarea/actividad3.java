/** Algoritmo de recursividad final para el calculo
 *  del máximo común divisor de dos números enteros
 *? Definición del problema: 
 *  El calculo del máximo común divisor se basa en la 
 *  siguiente propiedad de números enteros: 
 ** mcd (a, b) = mcd (a - b, b) si a >= 0
 ** mcd (a, b) = mcd (a, b - a) si b > a
 ** mcd (a, b) = a              si b = 0 
 ** mcd (a, b) = b              si a = 0
 *! Entrada: dos números enteros a y b, ambos números no deben ser negativos y simultaneamente 0
 *! Salida el mcd de ambos números.
 ** Para este algoritmo, a = 0 y b = 0, serviran de casos bases
 */
package Recursividad.Tarea;
import java.util.Scanner;

public class actividad3 {
    public static int mcd(int a, int b) { 
        if (b == 0) return a; // Caso base
        else if (a == 0) return b; // Caso base
        else if (a >= b) return mcd(a - b, b);
        else return mcd(a, b - a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        System.out.println("El mcd de " + a + " y " + b + " es " + mcd(a, b));

        sc.close();
    }
}
