
import java.util.Scanner;

public class EXercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int numero1, numero2;

        do
        {
          System.out.print("digite a primeira nota do aluno: ");
          numero1 = scanner.nextInt();
        }

        while (numero1 < 0 || numero1 > 10);
        
        do
        {
          System.out.print("digite a segunda nota do aluno: ");
          numero2 = scanner.nextInt();
        }
        while (numero2 < 0 || numero2 > 10);
        
        for (int i = 1; i <= 5; i++)
        {
           System.out.println("processando... " .repeat(i));
        }
        int media = (numero1 + numero2 ) /2;
        System.out.print("A media das notas foi de: " + media);
        
        scanner.close();
            
        
            
        
    }
}
