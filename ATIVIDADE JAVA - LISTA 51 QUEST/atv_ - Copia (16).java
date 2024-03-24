import java.util.Scanner;

public class NumerosParesImpares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        int numerosPares = 0;
        int numerosImpares = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("A quantidade de números pares é " + numerosPares);
        System.out.println("A quantidade de números impares é " + numerosImpares);
    }
}