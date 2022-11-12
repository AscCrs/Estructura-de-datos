package ProyChristian.practica2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Archivo archivo = new Archivo();
        int cantP = 0; // Cantidad de pares que se van a ingresar

        cantP = sc.nextInt();
        double m[][] = new double[cantP][2];

        for (int i = 0; i < cantP; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0, j = 0; i < cantP; i++) {
            Triangulo t = new Triangulo(m[i][j], m[i][j + 1]);
            archivo.almacenarTriangulo(t);
        }

        archivo.escribirArchivo();

        sc.close();
    }
}