package Asesoria;
import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //* String - Es una cadena de caracteres = Arreglo de caracteres 
        // ? [C, R, I, S, T, O, P, H, E, R]
        char nombre;
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.next().charAt(1);

        System.out.print(nombre);

        sc.close();
    }
}
