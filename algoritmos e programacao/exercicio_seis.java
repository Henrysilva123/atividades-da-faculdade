import java.util.Scanner;

public class exercicio_seis {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print(" digite o tempo em segundos: "); int totalSegundos = scanner.nextInt();
    int horas = totalSegundos / 3600;
    int resto = totalSegundos % 3600;

    int minutos = resto / 60;
    int segundos = resto % 60;
    System.out.println("Horas: " + horas);
    System.out.println("Minutos: "+ minutos);
    System.out.println("Segundos: " + segundos);
    
    scanner.close();





    }






}
