import java.util.Scanner;
public class arearectangulo{
  public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int area, altura, base;
    System.out.println("area de un rectangulo");
    System.out.println("ingrese la base del rectangulo");
    base = ingreso.nextInt();
    System.out.println("ingresa la altura del rectangulo");
    altura = ingreso.nextInt();
    area = base * altura ;
    System.out.println("El area es " + area );
  }
}
