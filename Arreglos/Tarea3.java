/*Crear un programa que lea un arreglo */
package Arreglos;
import java.util.Scanner;

public class Tarea3 {
    public static boolean sumasIguales(int[][] arr) {
        int sumaFil, sumaCol, sumaDia1, sumaDia2, sumaCol2, sumaCol3, cont, j;
        sumaFil = sumaCol = sumaDia1 = sumaDia2 = sumaCol2 = sumaCol3 = cont = j = 0;
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                sumaFil += arr[i][j];  
            if(sumaFil != 15)
                break;
            else
            cont++;
            //con ayuda del contador, tengo que evaluar 3 veces cada fila, cada columna y cada diagonal
            sumaFil = 0;
            sumaCol += arr[i][0];
            sumaCol3 += arr[i][2];
            sumaCol2 += arr[i][1];
            sumaDia1 += arr[i][i];
            sumaDia2 += arr[i][j-1];  
        }
        if (cont == 3 && (sumaCol + sumaCol3 + sumaCol2 + sumaDia1 + sumaDia2) % 15 ==0 )
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int [3][3];
        /*Llenar arreglo por espacios del cuadrado magico (la suma de en diagonales debe dar 15):
        2 9 4
        7 5 3
        6 1 8
        */
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        if(sumasIguales(arr))
            System.out.println("SI CUMPLE");
        else
            System.out.println("NO CUMPLE");

        sc.close();
    }
}
