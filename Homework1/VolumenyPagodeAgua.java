import java.util.Scanner;
public class VolumenyPagodeAgua{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double A, L, N, CM, V, PAG;
    System.out.println("Calcular el volumen de la piscina");
    System.out.println("Escribe el largo");
    L = ingreso.nextInt();
    System.out.println("Escribe el ancho");
    N = ingreso.nextInt();
    System.out.println("Escribe el altura");
    A = ingreso.nextInt();
    V = L * N * A;
    System.out.println("El volumen de la piscina es" + V);

    System.out.println("Escribe el costo de cada metro");
    CM = ingreso.nextInt();

    PAG = V * CM;
    System.out.println("El pago total es :" + PAG);
  }
}
