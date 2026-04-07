import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dinheiro (inteiro): ");
        int valor = scanner.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int quantidade;

        System.out.println("Quantidade de cada nota/moeda:");

        for (int nota : notas) {
            quantidade = valor / nota; 
            valor = valor % nota;      
            System.out.println("R$" + nota + ": " + quantidade);
        }

        scanner.close();
    }
}
