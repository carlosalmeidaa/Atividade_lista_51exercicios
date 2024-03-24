import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = entrada.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = entrada.nextInt();

        int potencia = 1;
        for (int i = 0; i < expoente; i++) {
            potencia = potencia * base;
        }

        System.out.println("A potência de " + base + " elevado a " + expoente + " é " + potencia);
    }
}