package Pilas;
/** HOLA
 * H 
 * O 
 * L 
 * A 
 */
import java.util.Scanner;

public class mainArrayStack {
    public static void main(String[] args) {
        // ArrayStack stack = new ArrayStack(4);

        // stack.push("H");
        // stack.push("O");
        // stack.push("L");
        // stack.push("A");

        // System.out.println(stack.peek());
        // stack.pop();
        // System.out.println(stack.peek());
        // System.out.println("La longitud de la pila es: " + stack.size());
        Scanner sc = new Scanner(System.in);
        int anchura = 0;
        char val;

        System.out.print("Ingrese el limite de elementos para la pila: ");
        anchura = sc.nextInt();

        ArrayStackSG stack = new ArrayStackSG(anchura);

        for (int index = 0; index < anchura; index++) {
            System.out.print("Ingrese el dato " + (index + 1) + ": ");
            stack.push(sc.nextInt());
        }

        System.out.print("Desea eliminar el tope de la pila S/N: ");
        val = sc.next().charAt(0);
        if (val == 'S' || val == 's') {
            stack.pop();
        }
        System.out.println("El tope de la pila es " + stack.getCima());

        sc.close();
    }
}
