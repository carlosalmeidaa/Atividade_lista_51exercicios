import java.util.Scanner;

public class Populacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a população inicial do país A: ");
        int populacaoA = entrada.nextInt();
        System.out.println("Digite a população inicial do país B: ");
        int populacaoB = entrada.nextInt();

        System.out.println("Digite a taxa de crescimento do país A: ");
        double taxaCrescimentoA = entrada.nextDouble();
        System.out.println("Digite a taxa de crescimento do país B: ");
        double taxaCrescimentoB = entrada.nextDouble();

        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA = (int) (populacaoA * (1 + taxaCrescimentoA));
            populacaoB = (int) (populacaoB * (1 + taxaCrescimentoB));
            anos++;
        }

        System.out.println("O número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B é " + anos);
    }
}