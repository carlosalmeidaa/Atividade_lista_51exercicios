import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero, inicio, fim;

        // Entrada de dados
        System.out.println("Informe o número para a tabuada: ");
        numero = leitor.nextInt();

        System.out.println("Informe o início da tabuada: ");
        inicio = leitor.nextInt();

        System.out.println("Informe o fim da tabuada: ");
        fim = leitor.nextInt();

        // Processamento
        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}