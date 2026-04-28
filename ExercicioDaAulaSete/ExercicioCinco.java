
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int dentro = 0; 
        int fora = 0;

        for(int i = 1; i <= 10; i++ )
        {
          System.out.print("digite o" + i + " numero: ");
          int numero = scanner.nextInt();

          if(numero >=10 && numero <=20)
          {
              dentro ++;
          }
          else 
          {
            fora ++;
          }

        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Números dentro do intervalo [10, 20]: " + dentro);
        System.out.println("Números fora do intervalo [10, 20]:   " + fora);
        
        scanner.close();
    }
}
