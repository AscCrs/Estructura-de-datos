/**
 * El dueño de un estacionamiento requiere un programa que le permita determinar cuanto debe cobrar
 * por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
 *  Las dos primeras horas a 15
 *  Las siguientes a 10
 *  
 *   float cobro, horas
 */
package Asesoria;
import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        /**
         * Booleanas 
         * X = 2
         * Y = 3
         * X < Y - Verdadera
         * X > Y - Falso
         * X <= Y - Verdadero
         * X >= Y - Falso
         * X != Y - Verdadera
         * X == Y - Falso
         *! Operaciones booleanas - AND = &&, OR ||, NOT !
         */
        // * if(X != Y) { texto: "5 es menor que 4" } - else { texto: "5 no es menor que 4" }
        Scanner sc = new Scanner(System.in);

        float cobro = 0;
        int horas;
        System.out.print("Ingrese el numero de horas: ");
        horas = sc.nextInt();
        if (horas <= 2 && horas >= 0) {
            cobro = horas * 15;
        } else if(horas >= 0 && horas > 2) {
            cobro = horas * 10;
        } 
        /*switch (horas) {
            case 1:
                cobro = horas * 15;
                break;
            case 2:
                cobro = horas * 15;
                break;
            case 3:
                cobro = horas * 10;
                break;
            case 4:
                cobro = horas * 10;
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }*/

        System.out.println("El total es " + cobro);

        sc.close();
    }
}
