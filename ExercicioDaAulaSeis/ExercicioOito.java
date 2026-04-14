
import java.util.Scanner;
public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner =new  Scanner(System.in);
        double inicio , fim, passo;

        System.out.println("digite o valor inicial em kelvin: ");
        inicio = scanner.nextDouble();

        System.out.println("digite o valor em felvin: ");
        fim = scanner . nextDouble();

        System.out.println("digite o passo: ");
        passo = scanner.nextDouble();
        
        double atual = inicio;
        System.out.println("\nK\t\tC");

        while ( atual <= fim)
        {
           double celsius = atual - 273.15;
           System.out.printf("%.2f\t%.2f\n", atual , celsius);
           atual +=passo;
        }
        scanner.close();

    }
}
