import java.util.Scanner;

public class SerieFibonacci2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor limite da série: ");
        int limite = entrada.nextInt();

        int a1 = 0;
        int a2 = 1;
        int an = 0;
        while (an < limite) {
            an = a1 + a2;
            a1 = a2;
            a2 = an;
            System.out.println(an);
        }
    }
}