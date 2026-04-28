import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor para o N: ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) 
        {
            for (int j = 1; j <= N; j++) 
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}
