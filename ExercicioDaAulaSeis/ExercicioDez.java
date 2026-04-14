public class ExercicioDez {
    public static void main(String[] args) {

        double valor = 500000; 
        double manutencao = 15000; 
        double totalManutencao = 0;

        int anos = 0;

        while (totalManutencao <= valor) {
            anos++;

            totalManutencao += manutencao;

            valor = valor * 0.88;

            manutencao += 5000;
        }

        System.out.println("Anos necessários: " + anos);
        System.out.println("Valor final da máquina: R$ " + valor);
        System.out.println("Custo acumulado de manutenção: R$ " + totalManutencao);
    }
}
