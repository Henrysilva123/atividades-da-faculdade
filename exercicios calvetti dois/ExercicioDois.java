
import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.print("digite a idade do nadador: ");
    int idade = scanner . nextInt();
    if (idade >= 18) 
    {
       System.out.println("o nadador é da categoria adulta: ");
    }

    else if (idade < 18)
    {
       System.out.println("o nadador é da categoria juvenil: ");
    }
    scanner.close();
    
    
    
    }
}
