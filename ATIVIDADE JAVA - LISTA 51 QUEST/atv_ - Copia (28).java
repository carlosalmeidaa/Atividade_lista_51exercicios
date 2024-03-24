import java.util.Scanner;

public class PanificadoraPaoDeOntem {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadePaes, valorPao;

        System.out.println("Qual o valor do pão?");
        valorPao = leitor.nextInt();

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " | " + valorPao * i);
        }
    }
}