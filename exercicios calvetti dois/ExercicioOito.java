import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o um numero: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite um segundo numero: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite um terceiro numero: ");
        int valor3 = scanner.nextInt();

        int menor, meio, maior;

        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        System.out.println("Ordem crescente: " + menor + " " + meio + " " + maior);

        scanner.close();
    }
}







