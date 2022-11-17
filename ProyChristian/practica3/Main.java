import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String ruta;

    System.out.println("Ingrese la ruta del contenido que quiere leer: ");
    ruta = sc.nextLine();
    LeerArchivo leer = new LeerArchivo(ruta);

    leer.mostrarContenido();

    sc.close();
  }
}
