/**
 *  Diseñe e implemente un método recursivo que nos permita obtener el determinante de
 *  una matriz cuadrada de dimensión n.
 */
package Recursividad.Proyecto;
import java.util.Scanner;

public class codigo3 {
    public static int determinante(int[][] mat) {
        int determinante = 0;

        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[0].length);
            int indice = (int)Math.pow(-1, i) * mat[0][i];
            int[][] subMat = new int[mat[0].length - 1][mat[0].length - 1];
            for (int j = 1; j < mat[0].length; j++) {
                int m = 0;
                for (int k = 0; k < mat[0].length; k++) {
                    if (k != i) {
                        subMat[j - 1][m] = mat[j][k];
                        m ++;
                    }
                }
            }
            if (mat[0].length == 2) {
                int determAux;
                determAux = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
                return determAux;
            } else determinante += indice * determinante(subMat);
        }
        return determinante;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        System.out.print("Ingrese la cantidad de columnas que tendra su matriz: ");
        columnas = sc.nextInt();
        System.out.print("Ingrese la cantidad de filas que tendra su matriz: ");
        filas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // matriz[0][0] = -2;
        // matriz[0][1] = 7;
        // matriz[1][0] = -12;
        // matriz[1][1] = 0;
        System.out.println("D = " + determinante(matriz));
        
        sc.close();
    }
}
