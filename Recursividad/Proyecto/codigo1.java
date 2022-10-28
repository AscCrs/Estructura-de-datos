/**
 * Diseñe un algoritmo recursivo donde se implemente el método 
 * de bisección para el cálculo de raíz aproximado de la función 
 * x^2-2 para un intervalo de [0, 2] con una tolerancia de 0.000001 (1e-6).
 */
package Recursividad.Proyecto;

public class codigo1 {
    static final double N = 2;
    static final double tol = 1e-6;
    public static double f (double x) {
        return x*x-N;
    }
    public static double biseccion (double min, double max) {
        double med = (min+max)/2;
        if (max-min<tol) {
            return med;
        } else if (f(min)*f(med)<0) {
            return biseccion (min,med);
        } else {
            return biseccion (med,max);
        }
    }

    public static void main(String[] args) {
        System.out.println("Valor aproximado: " + biseccion(0, N));
    }
}
