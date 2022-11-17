public class Empleado {
  String nombre;
  double salario;
  double comisiones;

  public Empleado(String nombre, double salario, double comisiones) {
    this.salario = salario;
    this.comisiones = comisiones;
  }

  @Override
  public String toString() {
    return "Empleado: " + nombre + "\nSalario: " + salario + "\nComisiones netas: " + comisiones + "\n";
  }
}
