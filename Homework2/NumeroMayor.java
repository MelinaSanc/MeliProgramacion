import java.util.Scanner;
public class NumeroMayor{
  public static void main(String[] args){
    Scanner ingreso = new Scanner(System.in);
    int num1, num2;
    System.out.println("Ingresa un numero:");
    num1 = ingreso.nextInt();
    System.out.println("Ingresa un numero:");
    num2 = ingreso.nextInt();

    if (num1>num2){
      System.out.println("El numero mayor es: " + num1);
    }else{
      System.out.println("El numero mayor es: " + num2);
    }

  }
 }
