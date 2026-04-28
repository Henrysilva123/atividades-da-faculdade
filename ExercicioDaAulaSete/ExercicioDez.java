public class ExercicioDez {
     public static void main(String[] args) {

        System.out.println("=== Tabela de Estresse da Placa Metálica (S = x² + y²) ===\n");

        // Cabeçalho da tabela
        System.out.print("  y\\x |");
        for (int x = 1; x <= 5; x++) {
            System.out.printf("  x=%-2d |", x);
        }
        System.out.println("\n" + "-".repeat(48));

        // Corpo da tabela
        for (int y = 1; y <= 5; y++) {
            System.out.printf("  y=%-2d |", y);
            for (int x = 1; x <= 5; x++) {
                int estresse = (x * x) + (y * y);
                System.out.printf("  %-4d |", estresse);
            }
            System.out.println();
        }

        System.out.println("-".repeat(48));
        System.out.println("\nPonto de maior estresse: (5, 5) → S = " + (5*5 + 5*5));
        System.out.println("Ponto de menor estresse: (1, 1) → S = " + (1*1 + 1*1));
    }
}
