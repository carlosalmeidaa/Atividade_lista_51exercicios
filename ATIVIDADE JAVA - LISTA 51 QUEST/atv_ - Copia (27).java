import java.util.Scanner;

public class LojasQuaseDois {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeItens, valorItem;

        System.out.println("Quantos itens você comprou?");
        quantidadeItens = leitor.nextInt();

        for (int i = 1; i <= quantidadeItens; i++) {
            System.out.println("Qual o valor do item " + i + "?");
            valorItem = leitor.nextInt();
        }

        System.out.println("A tabela de preços é:");
        System.out.println("Quantidade de itens | Valor da conta");
        for (int i = 1; i <= quantidadeItens; i++) {
            System.out.println(i + " | " + valorItem);
        }
    }
}
