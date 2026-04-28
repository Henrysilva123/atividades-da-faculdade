import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite um valor para N: ");
            int N = scanner.nextInt();

            int soma = 0;
            for (int i = 2; i <= N; i += 2) {
                soma += i;
            }

            System.out.println("A soma dos números pares de 1 a " + N + " é: " + soma);

            System.out.print("Deseja repetir para outro valor? (s/n): ");
            resposta = scanner.next().charAt(0);

        } while (resposta == 's' || resposta == 'S');

        System.out.println("Encerrando o programa.");
        scanner.close();
    }
}
