import java.util.Scanner;

public class ExercicioDoze {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int original = numero;

        if (numero <= 1) {
            System.out.println("  Digite um número maior que 1.");
            scanner.close();
            return;
        }

        System.out.println("\n=== Fatoração de " + original + " ===");
        System.out.printf("%-10s %-15s %-10s%n", "Número", "Divisor Primo", "Resultado");
        System.out.println("-".repeat(38));

        do {
            int divisor = 0;

            // Encontra o menor divisor primo
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    divisor = i;
                    break;
                }
            }

            System.out.printf("%-10d %-15d %-10d%n", numero, divisor, numero / divisor);
            numero /= divisor;

        } while (numero > 1);

        // Exibe o resultado final
        System.out.println("-".repeat(38));
        System.out.print("\n" + original + " = ");

        int temp = original;
        boolean primeiro = true;
        do {
            for (int i = 2; i <= temp; i++) {
                if (temp % i == 0) {
                    if (!primeiro) System.out.print(" × ");
                    System.out.print(i);
                    temp /= i;
                    primeiro = false;
                    break;
                }
            }
        } while (temp > 1);

        System.out.println();
        scanner.close();
    }
}
