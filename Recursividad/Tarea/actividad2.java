/**
 * *Algoritmo recursivo que realiza una exponenciación entera 
 * ?Concepto:
 * Se deriva de la definición de la potencia como una multiplicación abreviada
 * y la aplicación de la propiedad asociativa de la multiplicación:
 * a^b = a * a^b-1
 * Para este caso cuando el exponente b es par, se puede optimizar descomponiendo 
 * la exponenciació tal que:
 * a^b = a^b/2 * a^b/2
 * 
 * !Entrada: a y b deben ser dos números positivos y no pueden ser simultaneamente 0
 * !Salida: El resultado de elevar a^b
 * */
package Recursividad.Tarea;
import java.util.Scanner;

public class actividad2 {
    public static int expR(int a, int b) {
        int temp = 0;
        if (b == 0) return 1; //Caso base
        else if (b % 2 == 0) { //* Aquí se revisa si el exponente es par
            temp = expR(a, b / 2);
            return temp * temp;
        } else return a * expR(a, b - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor del exponente: ");
        int b = sc.nextInt();
        System.out.println(a + "^" + b + " = " + expR(a, b));

        sc.close();
    }
}
