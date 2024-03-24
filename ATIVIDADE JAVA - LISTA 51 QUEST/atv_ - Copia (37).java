import java.util.Scanner;

public class AcidentesDeTrânsito {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int codigoCidade, numeroVeiculos, numeroAcidentes;
        int maiorIndiceAcidentes = 0, menorIndiceAcidentes = 0;
        int mediaVeiculos = 0, mediaAcidentes = 0;

        // Entrada de dados
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o código da cidade: ");
            codigoCidade = leitor.nextInt();

            System.out.println("Informe o número de veículos de passeio: ");
            numeroVeiculos = leitor.nextInt();

            System.out.println("Informe o número de acidentes de trânsito com vítimas: ");
            numeroAcidentes = leitor.nextInt();

            // Processamento
            if (numeroAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = numeroAcidentes;
            }

            if (numeroAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = numeroAcidentes;
            }

            mediaVeiculos = mediaVeiculos + numeroVeiculos;
            mediaAcidentes = mediaAcidentes + numeroAcidentes;
        }

        // Saída de dados
        System.out.println("O maior índice de acidentes de trânsito foi na cidade de código " + maiorIndiceAcidentes);
        System.out.println("O menor índice de acidentes de trânsito foi na cidade de código " + menorIndiceAcidentes);
        System.out.println("A média de veículos nas cinco cidades juntas é " + mediaVeiculos / 5);
        System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é " + mediaAcidentes / 3);
    }
}