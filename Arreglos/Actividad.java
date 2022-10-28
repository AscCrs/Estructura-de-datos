/** Crear un programa que lea un arreglo de tamaño 25
 *  Se debe realizar una entrada y salida de datos
 * 
 * [1, 2, 3, 4, 5, 6, 7]
 *  0  1  2  3  4  5  6   n
 */
package Arreglos;
import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []notas = new int[25]; // Declaración de del arreglo de 25 posiciones

        for (int i = 0; i < 25; i++) { // Ciclo For que itera la cantidad de veces que sea necesario para llenar el arreglo
            System.out.println("Ingrese las nota " + (i+1) + ": ");
            notas[i] = sc.nextInt(); //Ingreso de los datos que depende del valor que tenga la variable iteradora
        }
 
        for (int i = 0; i < 25; i++) { // Ciclo For que se encarga de recorrer el arreglo para imprimir los datos
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        sc.close();
    }
}
