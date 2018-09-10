import java.util.Scanner;
public class TelasyPulgadas{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double CM, PG;
    System.out.println("Escribe la cantidad de metros :");
    CM = ingreso.nextInt();

    PG = CM / 0.0254;
    System.out.println("Tela a solicitar en pulgadas: " + PG);
  }
}
