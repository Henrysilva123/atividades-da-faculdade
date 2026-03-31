
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seu ano de nascemento: ");

        int nascimento = scanner.nextInt();
        System.out.print("digite o ano atual :");

        int anoAtual = scanner.nextInt();
        int idade = anoAtual - nascimento;
        System.out.println("idade: " + idade);

        if (idade >= 16)
        {
            System.out.println("ja pode votar: ");
        }
        else
        {
            System.out.println("não pode votar: ");
        }
        if (idade >= 18)
        {
            System.out.println("pode dirigir");
        }
        else
        {
            System.out.println("não pode dirigir");
        }
        scanner.close();

    }

}
