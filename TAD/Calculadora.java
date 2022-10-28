/* Crear una calculadora usando tipos de datos abstractos */
package TAD;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, opc = 0;
        float res = 0;   
        boolean val = true;

        do {
            System.out.println("Menu de opciones:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nIngrese la opcion:");
            opc = sc.nextInt();
            if (opc == 5) {
                val = false;
            } else if (opc > 0 && opc < 5) {
                System.out.print("Ingrese el primer numero: ");
                x = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                y = sc.nextInt();   

                switch (opc) {
                    case 1: 
                        res = x + y;
                        System.out.println(x + " + " + y + " = " + res);
                        break;
                    case 2: 
                        res = x - y;
                        System.out.println(x + " - " + y + " = " + res);
                        break;
                    case 3:
                        res = x * y;
                        System.out.println(x + " * " + y + " = " + res);
                        break;
                    case 4: 
                        res = x / y;
                        System.out.println(x + "/" + y + " = " + res);
                        break;
                    default:
                        System.out.println("Ingrese una opción valida");
                        break;
                }            
            } else {
                System.out.println("Ingrese una opcion valida!");
            }
        } while (val == true);
        sc.close();
    }
}
