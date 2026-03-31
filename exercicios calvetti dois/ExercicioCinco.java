
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[]args){
    Scanner scanner = new  Scanner (System.in);
    System.out.print("digite um numero: ");
    int numero = scanner.nextInt();
    if (numero % 5 == 0 && numero % 3 == 0)
    {
      System.out.println(" o numero é divisivel por 5 e 3");
    }
    else
    {
      System.out.println("o numero não e divisivel por 5 e 3");
    }
    scanner.close();
    








    }
}
