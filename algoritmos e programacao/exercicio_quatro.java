import java.util.Scanner;

public class exercicio_quatro {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    double dolar = 5.00;
    System.out.print("digite um valor monetário em reais");
    double numeroQualquer = scanner.nextDouble();
    double resultado = numeroQualquer / dolar;
    System.out.println("o resultado em dólares é de:" + resultado);
    scanner.close();





    }









}
