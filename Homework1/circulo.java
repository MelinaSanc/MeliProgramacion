import java.util.Scanner;
public class circulo{
   public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    double area, radio;
    double pi = 3.1416;
    System.out.println("Ingresa el radio del circulo:");
    radio = ingreso.nextInt();
    area = (radio*radio) * pi;
    System.out.println("El area es" + area);
  }
}
