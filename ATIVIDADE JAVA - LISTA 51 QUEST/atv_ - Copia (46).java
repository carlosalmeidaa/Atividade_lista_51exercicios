import java.util.Scanner;

public class Serie {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int n, i;
        double soma = 0;

        // Entrada de dados
        System.out.println("Informe o número de termos da série: ");
        n = leitor.nextInt();

        // Processamento
        for (i = 1; i <= n; i++) {