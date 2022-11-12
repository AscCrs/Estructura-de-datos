package ProyChristian.practica2;

public class Triangulo {
  double x;
  double y;
  double area;

  Triangulo(double base, double altura) {
    x = base;
    y = altura;
    area = base * altura / 2;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double base) {
    x = base;
  }

  public void setY(double altura) {
    y = altura;
  }

  public double altura() {
    return area;
  }

  public String toString() {
    return "Base:" + this.x + "\nAltura:" + this.y + "\nArea" + this.area + "\n";
  }
}
