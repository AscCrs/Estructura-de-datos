import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cantP = 0;
    cantP = sc.nextInt();

    int m[][] = new int[cantP][4];

    for (int i = 0; i < cantP; i++) {
      for (int j = 0; j < 4; j++) {
        m[i][j] = sc.nextInt();
      }
    }

    // 2 5 6 10
    // 1 1 50 60
    // 10 0 20 100
    // 0 1 2 3
    Operaciones op = new Operaciones();

    for (int i = 0, j = 0; i < cantP; i++) {
      Punto p1 = new Punto(m[i][j], m[i][j + 1]);
      Punto p2 = new Punto(m[i][j + 2], m[i][j + 3]);
      op.calcularDistancia(p1, p2);
    }

    sc.close();
  }
}
