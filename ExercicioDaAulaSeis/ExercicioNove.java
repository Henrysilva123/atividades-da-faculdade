import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n, b;

        System.out.print("Digite o valor de n: ");
        n = sc.nextDouble();

        System.out.print("Digite a base b: ");
        b = sc.nextDouble();

        // Validações básicas
        if (n <= 0 || b <= 1) {
            System.out.println("Valores inválidos! (n > 0 e b > 1)");
        } else {
            int contador = 0;

            while (n > 1) {
                n = n / b;
                contador++;
            }

            System.out.println("O log aproximado é: " + contador);
        }

        sc.close();
    }
}
