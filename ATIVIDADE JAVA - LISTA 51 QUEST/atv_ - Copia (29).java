import java.util.Scanner;

public class LojaDeConveniencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int quantidadeItens, totalItens, valorTotal;
        float valorDinheiro, troco;

        // Entrada de dados
        do {
            System.out.println("Informe o valor do produto: ");
            totalItens = leitor.nextInt();

            // Processamento
            valorTotal = valorTotal + totalItens;
        } while (totalItens != 0);

        // Saída de dados
        System.out.println("Total da compra: R$ " + valorTotal);
        System.out.println("Informe o valor do dinheiro recebido: ");
        valorDinheiro = leitor.nextFloat();

        // Cálculo do troco
        troco = valorDinheiro - valorTotal;

        // Saída de dados
        System.out.println("Troco: R$ " + troco);
    }
}