public class ExercicioSieis {
    public static void main(String[] args) throws InterruptedException {

        for (int minuto = 0; minuto <= 2; minuto++) {
            for (int segundo = 0; segundo <= 59; segundo++) {

                System.out.printf("Tempo decorrido: %02d:%02d\r", minuto, segundo);

                Thread.sleep(1000);
            }
        }

        System.out.println("\nProcesso industrial finalizado!     ");
    }
}
