import java.util.Scanner;

public class MenorMaiorSoma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de números: ");
        int n = entrada.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int menor = numeros[0];
        int maior = numeros[0];
        int soma = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            soma = soma + numeros[i];
        }

        System.out.println("O menor número é " + menor);
        System.out.println("O maior número é " + maior);
        System.out.println("A soma dos números é " + soma);
    }
}