/**
 * ?Concepto: 
 * El objetivo de este juego consiste en mover la torre de la varilla 
 * origen a la varilla destino con el menor número de movimientos posible
 */
package Recursividad.EjerciciosEnClase.TiposDeRecursividad;
import java.util.Scanner;

public class multiple {
    public static void mover(int disco, String origen, String destino, String aux) {
        if (disco == 1) {
            System.out.println("Mueva el disco " + disco + " desde la torre " +
            origen + " hasta la torre " + destino);
        } else {
            mover (disco - 1, origen, aux, destino);
            System.out.println("Mueve el disco " + disco + " desde la torre " + 
            origen + " hasta la torre " + destino);
            mover(disco - 1, aux, destino, origen);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mover(4, "P1", "P3", "P2");

        sc.close();
    }
}
