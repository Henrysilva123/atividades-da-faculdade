import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SENHA_CORRETA = "1234";
        boolean acertou = false;

        System.out.println("=== Sistema de Autenticação ===");

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            String senha;

            // Valida se a senha tem exatamente 4 dígitos
            do {
                System.out.print("\nTentativa " + tentativa + " de 3 — Digite a senha (4 dígitos): ");
                senha = scanner.next();

                if (senha.length() != 4) {
                    System.out.println("  Senha inválida! A senha deve ter exatamente 4 dígitos.");
                } else if (!senha.matches("\\d+")) {
                    System.out.println(" Senha inválida! Use apenas números.");
                    senha = "";
                }

            } while (senha.length() != 4 || !senha.matches("\\d+"));

            // Verifica se a senha está correta
            if (senha.equals(SENHA_CORRETA)) {
                acertou = true;
                break;
            } else {
                int restantes = 3 - tentativa;
                if (restantes > 0) {
                    System.out.println(" Senha incorreta! Tentativas restantes: " + restantes);
                }
            }
        }

        System.out.println("\n" + "=".repeat(35));
        if (acertou) {
            System.out.println(" Acesso autorizado! Bem-vindo ao sistema.");
        } else {
            System.out.println(" Acesso bloqueado! Número de tentativas excedido.");
        }
        System.out.println("=".repeat(35));

        scanner.close();
    }
}
