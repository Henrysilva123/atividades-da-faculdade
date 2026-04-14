import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Não é primo.");
        } else {
            int i = 2;
            boolean primo = true;

            while (i * i <= n) {
                if (n % i == 0) {
                    primo = false;
                    break; // para assim que encontra divisor
                }
                i++;
            }

            if (primo) {
                System.out.println("É primo.");
            } else {
                System.out.println("Não é primo.");
            }
        }

        sc.close();
    }
    
}
