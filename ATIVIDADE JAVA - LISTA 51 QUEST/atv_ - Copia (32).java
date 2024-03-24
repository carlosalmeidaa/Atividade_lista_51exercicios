import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero;

        // Entrada de dados
        System.out.println("Informe um número: ");
        numero = leitor.nextInt();

        // Processamento
        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }

        // Saída de dados
        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero, i;

        // Entrada de dados
        System.out.println("Informe um número: ");
        numero = leitor.nextInt();

        // Processamento
        for (i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i + " é primo");
            }
        }
    }
}