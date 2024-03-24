import java.util.Scanner;

public class SomaMediaNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 5 números: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        int numero4 = entrada.nextInt();
        int numero5 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4 + numero5;
        double media = soma / 5.0;

        System.out.println("A soma dos números é " + soma);
        System.out.println("A média dos números é " + media);
    }
}