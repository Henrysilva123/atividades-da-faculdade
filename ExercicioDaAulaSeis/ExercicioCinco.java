
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SenhaCorreta = 2026;
        int tentativas = 0;
        int senhaDigitada;
        
        while(tentativas < 3)
        {
          System.out.print("digite sua senha: ");
          senhaDigitada = scanner.nextInt();

          if(senhaDigitada == SenhaCorreta)
          {
            System.out.println("acesso permitido");
            break;
          }
          else
          {
             tentativas ++;
             System.out.println("Senha incorreta!");
          }
          if (tentativas == 3)
          {
             System.out.println("Terminal bloqueado");
          }
          scanner.close();
        }
    }
}
