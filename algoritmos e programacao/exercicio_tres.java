import java.util.Scanner;

public class exercicio_tres {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    double  nota1 , nota2 , nota3 , media;
    System.out.print("digite a primeira nota: "); nota1 = scanner. nextDouble();
    System.out.print("digite a segunda nota: "); nota2 = scanner. nextDouble();
    System.out.print("digite a terceira nota: "); nota3 = scanner. nextDouble();
    media = (nota1 + nota2+ nota3) /3;
    System.out.print("sua média foi de:" + media);
    scanner.close();


    }








}








