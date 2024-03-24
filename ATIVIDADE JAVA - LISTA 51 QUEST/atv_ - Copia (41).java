import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int nota, totalAcertos = 0, totalAlunos = 0, maiorAcerto = 0, menorAcerto = 0;
        String gabarito[] = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};

        // Entrada de dados
        do {
            System.out.println("Informe a nota do aluno: ");
            nota = leitor.nextInt();

            // Processamento
            if (nota >= 0 && nota <= 10) {
                totalAcertos += nota;
                totalAlunos++;
            }

            // Saída de dados
            System.out.println("Deseja informar a nota de outro aluno? (1 - Sim / 0 - Não)");
            int resposta = leitor.nextInt();

            if (resposta == 0) {
                break;
            }
        } while (true);

        // Cálculo da média das notas
        double media = totalAcertos / totalAlunos;

        // Busca do maior e do menor acerto
        for (int i = 0; i < gabarito.length; i++) {
            if (gabarito[i].equals("A")) {
                maiorAcerto = i + 1;
            } else if (gabarito[i].equals("E")) {
                menorAcerto = i + 1;
            }
        }

        // Saída de dados
        System.out.println("A média das notas da turma é " + media);
        System.out.println("O maior acerto foi " + maiorAcerto);
        System.out.println("O menor acerto foi " + menorAcerto);
    }
}