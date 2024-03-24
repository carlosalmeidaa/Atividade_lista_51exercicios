import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        int numero4 = entrada.nextInt();
        int numero5 = entrada.nextInt();

        int maiorNumero = numero1;
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }
        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
        if (numero4 > maiorNumero) {
            maiorNumero = numero4;
        }
        if (numero5 > maiorNumero) {
            maiorNumero = numero5;
        }

        System.out.println("O maior número é " + maiorNumero);
    }
}