import java.util.Scanner;

public class SomaNumerosIntervalo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        int soma = 0;
        for (int i = numero1; i <= numero2; i++) {
            soma = soma + i;
        }

        System.out.println("A soma dos números é " + soma);
    }
}