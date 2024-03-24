import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeTurmas, quantidadeAlunos, somaAlunos = 0;
        double mediaAlunos;

        System.out.println("Quantas turmas serão analisadas?");
        quantidadeTurmas = leitor.nextInt();

        for (int i = 0; i < quantidadeTurmas; i++) {
            System.out.println("Quantos alunos tem na turma " + (i + 1) + "?");
            quantidadeAlunos = leitor.nextInt();
            somaAlunos = somaAlunos + quantidadeAlunos;
        }

        mediaAlunos = somaAlunos / quantidadeTurmas;
        System.out.println("A média de alunos por turma é " + mediaAlunos);
    }
}