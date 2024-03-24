import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int ano, salarioInicial, salarioAtual;

        // Entrada de dados
        System.out.println("Informe o ano de contratação do funcionário: ");
        ano = leitor.nextInt();

        System.out.println("Informe o salário inicial do funcionário: ");
        salarioInicial = leitor.nextInt();

        // Processamento
        for (int i = 1996; i <= ano; i++) {
            salarioAtual = salarioInicial * (1.015 * i);
        }

        // Saída de dados
        System.out.println("O salário atual do funcionário é " + salarioAtual);
    }
}