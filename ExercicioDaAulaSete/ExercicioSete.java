import java.util.Scanner;

public class ExercicioSete {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;
        int lote = 1;

        do {
            double soma = 0;

            System.out.println("\n=== Lote " + lote + " ===");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a medida da peça " + i + ": ");
                double medida = scanner.nextDouble();
                soma += medida;
            }

            double media = soma / 5;
            System.out.printf("Média do lote %d: %.2f%n", lote, media);

            if (media < 10.0) {
                System.out.println(" Atenção: média abaixo do padrão mínimo (10.0)!");
            } else {
                System.out.println(" Lote aprovado!");
            }

            lote++;

            System.out.print("\nDeseja processar um novo lote? (s/n): ");
            resposta = scanner.next().charAt(0);

        } while (resposta == 's' || resposta == 'S');

        System.out.println("\nProcessamento encerrado. Total de lotes processados: " + (lote - 1));
        scanner.close();
    }
}
