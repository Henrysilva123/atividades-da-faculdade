import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int termos = sc.nextInt();

        double soma = 0;
        int i = 0;

        while (i < termos) {
            double denominador = 2 * i + 1;

            if (i % 2 == 0) {
                soma += 1 / denominador;
            } else {
                soma -= 1 / denominador;
            }

            i++;
        }

        double piAproximado = 4 * soma;

        System.out.println("Pi aproximado: " + piAproximado);
        System.out.println("Valor de Math.PI: " + Math.PI);
        System.out.println("Diferença: " + Math.abs(Math.PI - piAproximado));

        sc.close();
    }
}
