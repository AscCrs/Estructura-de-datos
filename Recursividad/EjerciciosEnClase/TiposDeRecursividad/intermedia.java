/*
 * método recursivo para generar todos los demás elementos en la matriz dada hacia atrás,
 * terminando con el elemento en el índice k.
 * Una matriz de entrada de ejemplo {1,2,3,4,5,6,7,8,9,10}, llamada con k=2, debería generar 9753
*/
package Recursividad.EjerciciosEnClase.TiposDeRecursividad;

public class intermedia {
    public static String printEveryOther(final int[] ia, final int k) {
        String s = "";
        if (ia==null)
            return null;
        if (k < 0) throw new IllegalArgumentException("index must be greater or equal 0");
        if (k < ia.length) {
            s = printEveryOther(ia, k+2) + ia[k];
        }
        return s;
    }

    /*
     * toma recursivamente una cadena y coloca un * entre las letras adyacentes que son iguales
     * La cadena de entrada de ejemplo toma "Valla" y devuelve "Val*la"
     */
    public static String printStars(final String s) { 
        if (s == null)
            return null;
        if(s.length() <= 1) {
            return s;
        }
        String x = s.substring(0, 1);
        if (Character.isLetter(x.charAt(0)) && x.equals(s.substring(1, 2))) {
            return x + "*" + printStars(s.substring(1) );
        } else return x + printStars(s.substring(1) );
    }
    public static void main(String[] args) {
        printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10}, 2);
        System.out.println();
        System.out.println(printStars("Valla"));
    }
}
