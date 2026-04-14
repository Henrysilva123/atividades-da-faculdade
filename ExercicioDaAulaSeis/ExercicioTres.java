
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double temperatura;
        double soma = 0;
        int contador = 0;

        System.out.println("digite as temperaturas: ");
        temperatura = scanner.nextDouble();

        while (temperatura != 999)
        {
           soma += temperatura;
           contador ++;

           temperatura = scanner .nextDouble();
        }
        
        if (contador > 0)
        {
          double Media = soma / contador;
          System.out.println("média das temperaturas: " + Media);
        }
        else
        {
          System.out.println("nenhuma temperatura válida foi digitada");
        }
        scanner.close();

    }
}
