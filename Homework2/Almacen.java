import java.util.Scanner;
public class Almacen{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Double DE, PF;
    
    System.out.println("Ingresa el precio de la camisa: ");
    Double CT = input.nextDouble();

    if (CT >= 2500 ){
      DE = (CT * 15) / 100;
      PF = CT - DE;
      System.out.println("El precio final es : " + PF);
    }else{
      DE = (CT * 8) / 100;
      PF = CT - DE;
      System.out.println("El precio final es :" + PF);
    }

  }

}
