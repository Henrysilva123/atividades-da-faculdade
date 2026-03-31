import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um numero: ");
        double a = scanner.nextDouble();

        System.out.println("digite um segundo numero numero: ");
        double b = scanner.nextDouble();

        System.out.println("digite um terceiro numero: ");
        double c = scanner.nextDouble();

        if (a + b <= c || b + c <= a || a + c <= b)
        {
            System.out.println("invalido");
        }
        else if (a == b && c == b)
        {
            System.out.println("equilatero");
        }
        else if (a == b || b == c || a == c)
        {
            System.out.println("isoceles");
        }
        else
        {
            System.out.println("escaleno");
        }
        scanner.close();
    }

}
