import java.util.Scanner;
public class exercicio_cinco {
    public static void main (String[]args){
     Scanner scanner= new Scanner(System.in);
     System.out.print ("digite seu peso: "); double peso = scanner.nextDouble();
     System.out.print ("digite sua altura: "); double altura = scanner.nextDouble();
     double imc = peso / (altura * altura);
     System.out.println("IMC= " + imc);
     scanner.close();
    }



}
