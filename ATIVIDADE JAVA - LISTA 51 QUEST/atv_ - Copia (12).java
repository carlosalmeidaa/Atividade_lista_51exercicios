import java.util.Scanner;

public class NumerosIntervalo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }
    }
}