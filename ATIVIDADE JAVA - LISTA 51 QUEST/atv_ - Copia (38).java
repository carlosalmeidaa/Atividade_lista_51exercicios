import java.util.Scanner;

public class TabelaDeAmortização {

    public static void main(String[] args) {


        import java.util.Scanner;

public class Intervalos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero, intervalo;
        int quantidade0a25 = 0, quantidade26a50 = 0, quantidade51a75 = 0, quantidade76a100 = 0;

        // Entrada de dados
        do {
            System.out.println("Informe um número: ");
            numero = leitor.nextInt();

            // Processamento
            if (numero >= 0 && numero <= 25) {
                quantidade0a25++;
            } else if (numero >= 26 && numero <= 50) {
                quantidade26a50++;
            } else if (numero >= 51 && numero <= 75) {
                quantidade51a75++;
            } else if (numero >= 76 && numero <= 100) {
                quantidade76a100++;
            }
        } while (numero >= 0);

        // Saída de dados
        System.out.println("Quantidade de números no intervalo [0-25]: " + quantidade0a25);
        System.out.println("Quantidade de números no intervalo [26-50]: " + quantidade26a50);
        System.out.println("Quantidade de números no intervalo [51-75]: " + quantidade51a75);
        System.out.println("Quantidade de números no intervalo [76-100]: " + quantidade76a100);
    }
}