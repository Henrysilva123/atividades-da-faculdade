import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a coordenada y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("O ponto está no Quadrante I");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no Quadrante II");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no Quadrante III");
        } else if (x > 0 && y < 0) {
            System.out.println("O ponto está no Quadrante IV");
        } else if (x == 0 && y != 0) {
            System.out.println("O ponto está sobre o eixo Y");
        } else if (y == 0 && x != 0) {
            System.out.println("O ponto está sobre o eixo X");
        } else {
            System.out.println("O ponto está na origem");
        }

        scanner.close();
    }
}
