package ProyChristian;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Recordatorio r = new Recordatorio();
        r.setMensaje("Primero", "1 ero de noviembre");
        r.setMensaje("Segundo", "12 de Diciembre");

        r.crearArchivo();

        sc.close();
    }
}
