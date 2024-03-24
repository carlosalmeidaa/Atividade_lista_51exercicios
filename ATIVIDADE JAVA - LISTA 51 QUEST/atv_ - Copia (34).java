import java.util.Scanner;

public class Academia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int codigo, altura, peso;
        int maiorAltura = 0, menorAltura = 0, maiorPeso = 0, menorPeso = 0;
        int quantidadeAlunos = 0;
        double mediaAltura = 0, mediaPeso = 0;

        // Entrada de dados
        System.out.println("Informe o código do cliente: ");
        codigo = leitor.nextInt();

        while (codigo != 0) {
            System.out.println("Informe a altura do cliente: ");
            altura = leitor.nextInt();

            System.out.println("Informe o peso do cliente: ");
            peso = leitor.nextInt();

            // Processamento
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso;
            }

            if (peso < menorPeso) {
                menorPeso = peso;
            }

            quantidadeAlunos++;
            mediaAltura = mediaAltura + altura;
            mediaPeso = mediaPeso + peso;

            // Entrada de dados
            System.out.println("Informe o código do cliente: ");
            codigo = leitor.nextInt();
        }

        // Saída de dados
        System.out.println("O cliente mais alto tem o código " + maiorAltura);
        System.out.println("O cliente mais baixo tem o código " + menorAltura);
        System.out.println("O cliente mais gordo tem o código " + maiorPeso);
        System.out.println("O cliente mais magro tem o código " + menorPeso);
        System.out.println("A média das alturas é " + mediaAltura / quantidadeAlunos);
        System.out.println("A média dos pesos é " + mediaPeso / quantidadeAlunos);
    }
}