import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero, fatorial;

        // Entrada de dados
        System.out.println("Informe o número para calcular seu fatorial: ");
        numero = leitor.nextInt();

        // Processamento
        fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        // Saída de dados
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}