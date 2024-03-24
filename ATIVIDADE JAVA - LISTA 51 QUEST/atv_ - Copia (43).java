import java.util.Scanner;

public class Ginastica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        String nome;
        double nota1, nota2, nota3, nota4, nota5, nota6, nota7;

        // Entrada de dados
        System.out.println("Informe o nome do ginasta: ");
        nome = leitor.nextLine();

        System.out.println("Informe a nota do primeiro jurado: ");
        nota1 = leitor.nextDouble();

        System.out.println("Informe a nota do segundo jurado: ");
        nota2 = leitor.nextDouble();

        System.out.println("Informe a nota do terceiro jurado: ");
        nota3 = leitor.nextDouble();

        System.out.println("Informe a nota do quarto jurado: ");
        nota4 = leitor.nextDouble();

        System.out.println("Informe a nota do quinto jurado: ");
        nota5 = leitor.nextDouble();

        System.out.println("Informe a nota do sexto jurado: ");
        nota6 = leitor.nextDouble();

        System.out.println("Informe a nota do sétimo jurado: ");
        nota7 = leitor.nextDouble();

        // Processamento
        double melhorNota = Math.max(nota1, Math.max(nota2, Math.max(nota3, Math.max(nota4, Math.max(nota5, Math.max(nota6, nota7))))));
        double piorNota = Math.min(nota1, Math.min(nota2, Math.min(nota3, Math.min(nota4, Math.min(nota5, Math.min(nota6, nota7))))));
        double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 - melhorNota - piorNota) / 5;

        // Saída de dados
        System.out.println("O melhor nota foi " + melhorNota);
        System.out.println("O pior nota foi " + piorNota);
        System.out.println("A média foi " + media);
    }
}