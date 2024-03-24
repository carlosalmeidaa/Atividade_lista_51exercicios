import java.util.Scanner;

public class ColecionadorCDs {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeCDs, valorCD, valorTotal;
        double valorMedio;

        System.out.println("Quantos CDs você tem?");
        quantidadeCDs = leitor.nextInt();

        valorTotal = 0;
        for (int i = 0; i < quantidadeCDs; i++) {
            System.out.println("Qual o valor do CD " + (i + 1) + "?");
            valorCD = leitor.nextInt();
            valorTotal = valorTotal + valorCD;
        }

        valorMedio = valorTotal / quantidadeCDs;
        System.out.println("O valor total investido em CDs é " + valorTotal);
        System.out.println("O valor médio gasto em cada CD é " + valorMedio);
    }
}