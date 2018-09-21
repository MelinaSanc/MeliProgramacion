import java.util.Scanner;
public class Mayor{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int cant1, cant2, cant3, M;
    System.out.println("Escribe el primer valor:");
    cant1 = input.nextInt();
    System.out.println("Escribe el segundo valor:");
    cant2 = input.nextInt();
    System.out.println("Escribe el tercer valor:");
    cant3 = input.nextInt();

    if (cant1>cant2 && cant1>cant3){
      System.out.println("El valor mayor es: " + cant1);
    }else if (cant2>cant1 && cant2>cant3){
      System.out.println("El numero mayor es: " + cant2);
    }else{
      System.out.println("El valor mayor es: " + cant3);
    }

  }
 }
