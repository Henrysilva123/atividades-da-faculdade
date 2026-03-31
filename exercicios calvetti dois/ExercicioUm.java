
import java.util.Scanner;

public class ExercicioUm {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("digite um numero inteiro: ");
    int numero = scanner . nextInt();
    
    if (numero > 0)
    {
      System.out.println("o numero é positivo: ");
    }

    else if (numero < 0)
    {
       System.out.println ("o numero é negativo: ");
    }
   scanner.close();

 }

}