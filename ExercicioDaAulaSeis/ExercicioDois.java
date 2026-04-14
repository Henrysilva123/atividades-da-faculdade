
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("digite o valor de a: ");
        int a =  scanner.nextInt();
        
        System.out.print("digite o valor de b: ");
        int b = scanner.nextInt();
        
        int inicio , fim;
        if (a < b)
        {
          inicio = a + 1;
          fim = b;
        }
        else
        {
          inicio = b + 1;
          fim = a;
        }

        System.out.println("um numero emtre" + a + "e" + b + ":" );
        
        while (inicio < fim)
        {
          System.out.println(inicio);
          inicio++;
        }
        scanner.close();
    }
}
