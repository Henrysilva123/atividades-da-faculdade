import java.util.Scanner;
public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a quantidade de termos: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;
        int contador = 0;
        
        while (contador < numero) 
        { 
            System.out.println(a + "");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador ++;
        }
        scanner.close();
    } 
}
