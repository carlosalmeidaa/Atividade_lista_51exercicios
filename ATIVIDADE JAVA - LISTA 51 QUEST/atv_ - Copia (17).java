import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de termos da série: ");
        int n = entrada.nextInt();

        int a1 = 0;
        int a2 = 1;
        int an = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                an = i;
            } else {
                an = a1 + a2;
                a1 = a2;
                a2 = an;
            }
            System.out.println(an);
        }
    }
}