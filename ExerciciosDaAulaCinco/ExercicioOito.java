import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();

        if (ano >= 1900 && ano < 2000) {
            System.out.println("Você nasceu no século XX");
        } else if (ano >= 2000 && ano < 2100) {
            System.out.println("Você nasceu no século XXI");
        } else {
            System.out.println("Você nasceu em outro século");
        }

        scanner.close();
    }
}
