import java.util.Scanner;

public class SaltoDistancia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        String nome;
        double salto1, salto2, salto3, salto4, salto5, melhorSalto, piorSalto, mediaSalto;

        // Entrada de dados
        System.out.println("Informe o nome do atleta: ");
        nome = leitor.nextLine();

        System.out.println("Informe o primeiro salto: ");
        salto1 = leitor.nextDouble();

        System.out.println("Informe o segundo salto: ");
        salto2 = leitor.nextDouble();

        System.out.println("Informe o terceiro salto: ");
        salto3 = leitor.nextDouble();

        System.out.println("Informe o quarto salto: ");
        salto4 = leitor.nextDouble();

        System.out.println("Informe o quinto salto: ");
        salto5 = leitor.nextDouble();

        // Processamento
        melhorSalto = Math.max(salto1, Math.max(salto2, Math.max(salto3, Math.max(salto4, salto5))));
        piorSalto = Math.min(salto1, Math.min(salto2, Math.min(salto3, Math.min(salto4, salto5))));
        mediaSalto = (salto1 + salto2 + salto3 + salto4 + salto5 - melhorSalto - piorSalto) / 3;

        // Saída de dados
        System.out.println("O melhor salto foi " + melhorSalto);
        System.out.println("O pior salto foi " + piorSalto);
        System.out.println("A média dos demais saltos foi " + mediaSalto);
        System.out.println("O resultado final do atleta " + nome + " foi " + mediaSalto);
    }
}