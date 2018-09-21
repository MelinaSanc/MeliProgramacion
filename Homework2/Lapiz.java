import java.util.Scanner;
public class Lapiz{
  public static void main(String[] args){
    Scanner ingreso = new Scanner(System.in);
    int X, pago;

    System.out.println("Ingresa la cantidad de lapices :");
    X = ingreso.nextInt();

    if(X>=1000){
      pago = (X * 85);
      System.out.println("La cantidad a pagar es: " + pago);
    }else{
      pago = (X * 90);
      System.out.println("Lacantidad a pagar es: " + pago);
    }
  }
 }
