import java.util.Scanner;

public class MediaIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade, n, somaIdade = 0;
        double mediaIdade;

        System.out.println("Quantas pessoas serão analisadas?");
        n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = leitor.nextInt();
            somaIdade = somaIdade + idade;
        }

        mediaIdade = somaIdade / n;
        System.out.println("A média de idade da turma é " + mediaIdade);

        if (mediaIdade <= 25) {
            System.out.println("A turma é jovem.");
        } else if (mediaIdade <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
    }
}
