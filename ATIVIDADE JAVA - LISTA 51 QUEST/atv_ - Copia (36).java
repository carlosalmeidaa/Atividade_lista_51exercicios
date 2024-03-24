import java.util.Scanner;

public class Alunos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int numero, altura;
        int maiorAltura = 0, menorAltura = 0;

        // Entrada de dados
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o número do aluno: ");
            numero = leitor.nextInt();

            System.out.println("Informe a altura do aluno: ");
            altura = leitor.nextInt();

            // Processamento
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        // Saída de dados
        System.out.println("O aluno mais alto tem o número " + maiorAltura);
        System.out.println("O aluno mais baixo tem o número " + menorAltura);
    }
}