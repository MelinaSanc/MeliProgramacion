import java.util.Scanner;
public class SueldodelTrabajador{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double HT, PH, SS;
    System.out.println("Escribe el numero de horas:");
    HT = ingreso.nextInt();

    System.out.println("Escribe el pago por hora");
    PH = ingreso.nextInt();

    SS = HT * PH;
    System.out.println("El sueldo es :" + SS);
  }
}
