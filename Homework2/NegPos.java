import java.util.Scanner;
public class NegPos{
  public static void main(String[] args){
    Scanner ingreso = new Scanner(System.in);
    int num1;
    System.out.println("Ingresa un numero:");
    num1 = ingreso.nextInt();


    if (num1>0){
      System.out.println("El numero es positivo ");
    }else{
      System.out.println("El numero es negativo ");
    }

  }
 }
