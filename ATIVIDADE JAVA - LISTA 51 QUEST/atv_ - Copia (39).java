import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int codigo, quantidade;
        double valor;

        // Entrada de dados
        System.out.println("Informe o código do item: ");
        codigo = leitor.nextInt();

        System.out.println("Informe a quantidade desejada: ");
        quantidade = leitor.nextInt();

        // Processamento
        switch (codigo) {
            case 100:
                valor = 1.20 * quantidade;
                break;
            case 101:
                valor = 1.30 * quantidade;
                break;
            case 102:
                valor = 1.50 * quantidade;
                break;
            case 103:
                valor = 1.20 * quantidade;
                break;
            case 104:
                valor = 1.30 * quantidade;
                break;
            case 105:
                valor = 1.00 * quantidade;
                break;
            default:
                valor = 0;
                break;
        }

        // Saída de dados
        System.out.println("O valor a ser pago é " + valor);
    }
}