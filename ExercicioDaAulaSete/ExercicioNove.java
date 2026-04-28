import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (A): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente (B): ");
        int expoente = scanner.nextInt();

        double resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.printf("\n%.2f^%d = %.2f%n", base, expoente, resultado);

        scanner.close();
    }
}
