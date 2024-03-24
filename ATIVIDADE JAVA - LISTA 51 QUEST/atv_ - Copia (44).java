import java.util.Scanner;

public class NumeroInvertido {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero, numeroInvertido = 0;

        // Entrada de dados
        System.out.println("Informe um número inteiro positivo: ");
        numero = leitor.nextInt();

        // Processamento
        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero = numero / 10;
        }

        // Saída de dados
        System.out.println("O número invertido é " + numeroInvertido);
    }
}