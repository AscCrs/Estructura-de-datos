import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AlmacenarDatos ad = new AlmacenarDatos();
    int opc = 0;
    double salario, comisiones;
    String nombre;
    boolean val = true;


    do {
      System.out.println("Desea almacenar la informacion de un empleado (1 = S, 2 = N)");  
      if (opc == 1) {
        System.out.println("Nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        salario = sc.nextDouble();
        System.out.println("Ingrese las comisiones netas del empleado: ");
        comisiones = sc.nextDouble();
        Empleado em = new Empleado(nombre, salario, comisiones); 
        ad.GuardarEmpleado(em);
      } else {
        ad.escribirArchivo();
      }
    } while (val == true);

    sc.close();
  }
}
