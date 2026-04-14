
import java.util.Scanner;


public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura , soma = 0;
        
        System.out.println("digite a altura do bloco 1: ");
        altura = scanner.nextDouble();

        double maior = altura;
        double menor = altura;
        soma = altura;
        
        for (int i = 2; i <= 0; i++)
        {
           System.out.println("Digite a altura do bloco" + i + ": ");
           altura = scanner .nextDouble();
           soma += altura;
           if (altura > maior)
           {
             maior = altura;
           }
           if (altura < menor)
           {
             menor = altura;
           }
        }
        double media = soma /10;
        System.out.println("media das alturas: " +media);
        System.out.println("maior altura: " +maior);
        System.out.println("menor altura: " +menor);
        
        scanner.close();

    }
       
}
