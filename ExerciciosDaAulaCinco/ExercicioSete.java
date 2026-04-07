import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 16) {
            System.out.println("Classificação: Baixo peso grau III");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Classificação: Baixo peso grau II");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Classificação: Baixo peso grau I");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III");
        }

        scanner.close();
    }
}
