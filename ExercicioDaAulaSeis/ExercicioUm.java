
import java.util.Scanner;

public class ExercicioUm {
   public static void main(String[] args) {
   Scanner scanner = new  Scanner (System.in);
   
   System.out.println("digite um número inteiro: ");
   int numero = scanner .nextInt();
   
   System.out.println("apenas muntiplos de 3;");
   
   for (int i = 1; i <= 10; i++)
   {
     int resultado = numero * i;
     if (resultado % 3 == 0)
     {
       System.out.println(numero + " x " + i +" = " + resultado);
     }
   }
 scanner.close();

 }
    
}