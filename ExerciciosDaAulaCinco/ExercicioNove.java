import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double temperaturaOriginal, temperaturaConvertida;

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em °C: ");
                temperaturaOriginal = scanner.nextDouble();
                temperaturaConvertida = (temperaturaOriginal * 9/5) + 32;
                System.out.printf("%.2f °C = %.2f °F\n", temperaturaOriginal, temperaturaConvertida);
                break;
            case 2:
                System.out.print("Digite a temperatura em °F: ");
                temperaturaOriginal = scanner.nextDouble();
                temperaturaConvertida = (temperaturaOriginal - 32) * 5/9;
                System.out.printf("%.2f °F = %.2f °C\n", temperaturaOriginal, temperaturaConvertida);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
