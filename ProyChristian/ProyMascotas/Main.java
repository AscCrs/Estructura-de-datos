package ProyChristian.ProyMascotas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Almacenamiento almacenar= new Almacenamiento();
        String n, r, e;
        char add;
        boolean val = true;

        do {
            System.out.print("Desea agregar una mascota (s/n): ");
            add = sc.next().charAt(0);
            if (add == 'S' || add == 's') {
                sc.nextLine();
                System.out.print("Ingresar nombre: ");
                n = sc.nextLine();
                System.out.print("Ingresar raza: ");
                r = sc.nextLine();
                System.out.print("Ingresar edad: ");
                e = sc.nextLine();
                Mascota m = new Mascota(n, r, e);
                almacenar.guardarDatos(m);
            } else if(add == 'N' || add == 'n') {
                almacenar.guardarArchivo();
                val = false;
            }
        } while (val == true);

        sc.close();
    }
}
