import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}