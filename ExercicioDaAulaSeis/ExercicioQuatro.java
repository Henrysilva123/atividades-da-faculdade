
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor positivo");
        int numero = scanner .nextInt();

        if(numero < 0)
        {
          System.out.println("por favor digite um numero positivo");
        }
        else
        {
          while (numero >= 0) 
          { 
              System.out.println("Sistema operando. T-" + numero + "segundos");
              numero--;
          }
        }
        scanner.close();

    }
}
