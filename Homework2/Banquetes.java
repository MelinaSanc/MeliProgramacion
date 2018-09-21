import java.util.Scanner;
public class Banquetes{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int Nper, TOT;
  System.out.println("Ingresa un numero de personas:");
  Nper = input.nextInt();

  if (Nper>300){
  TOT = Nper * 75;
  System.out.println("Total a pagar del banquete: " + TOT);
} else if (Nper>200 && Nper <=300){
  TOT = Nper * 85;
  System.out.println("Total a pagar del banquete: " + TOT);
}else{
  TOT = Nper * 95;
  System.out.println("Total a pagar del banquete: " + TOT);
}
 }
}
