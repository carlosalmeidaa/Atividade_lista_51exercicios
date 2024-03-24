import java.util.Scanner;

public class MenorMaiorTemperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int quantidadeTemperaturas, menorTemperatura, maiorTemperatura, temperatura;
        float mediaTemperaturas;

        // Entrada de dados
        System.out.println("Informe a quantidade de temperaturas: ");
        quantidadeTemperaturas = leitor.nextInt();

        // Processamento
        menorTemperatura = Integer.MAX_VALUE;
        maiorTemperatura = Integer.MIN_VALUE;
        mediaTemperaturas = 0;

        for (int i = 0; i < quantidadeTemperaturas; i++) {
            System.out.println("Informe a temperatura " + (i + 1) + ": ");
            temperatura = leitor.nextInt();

            mediaTemperaturas = mediaTemperaturas + temperatura;

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }

        // Saída de dados
        System.out.println("A menor temperatura é " + menorTemperatura);
        System.out.println("A maior temperatura é " + maiorTemperatura);
        System.out.println("A média das temperaturas é " + mediaTemperaturas / quantidadeTemperaturas);
    }
}