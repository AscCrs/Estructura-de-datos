package Recursividad.EjerciciosEnClase.TiposDeRecursividad;

public class deCabeza {
    static int f(int n) { 
        if (n > 0) {
            return f(n - 1) + n;
        } else return 0;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(f(a));
    }
}