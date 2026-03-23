import java.util.Scanner;
public class exercicio_dois {
    public static void main (String[]args){
     Scanner scanner = new Scanner (System.in);
     System.out.print("digite o valor do lado do quadrado:");
     double lado = scanner.nextDouble();
     double area = lado * lado;
     System.out.println("o valor da área do quadrado é de:" +area);
     scanner.close();




    }
}
