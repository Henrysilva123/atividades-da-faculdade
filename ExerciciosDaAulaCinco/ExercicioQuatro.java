import java.util.Scanner;

public class ExercicioQuatro {
      public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        if (preco <= 50) {
            System.out.println("Barato");
        } else if (preco <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }

        scanner.close();
    }
}
