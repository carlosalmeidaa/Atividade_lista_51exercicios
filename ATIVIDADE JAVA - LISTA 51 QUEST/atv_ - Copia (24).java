import java.util.Scanner;

public class Eleicao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroEleitores, numeroVotosCandidato1, numeroVotosCandidato2, numeroVotosCandidato3;

        System.out.println("Qual é o número total de eleitores?");
        numeroEleitores = leitor.nextInt();

        System.out.println("Quantos votos recebeu o candidato 1?");
        numeroVotosCandidato1 = leitor.nextInt();

        System.out.println("Quantos votos recebeu o candidato 2?");
        numeroVotosCandidato2 = leitor.nextInt();

        System.out.println("Quantos votos recebeu o candidato 3?");
        numeroVotosCandidato3 = leitor.nextInt();

        System.out.println("O candidato 1 recebeu " + numeroVotosCandidato1 + " votos.");
        System.out.println("O candidato 2 recebeu " + numeroVotosCandidato2 + " votos.");
        System.out.println("O candidato 3 recebeu " + numeroVotosCandidato3 + " votos.");

        double percentualVotosCandidato1 = (numeroVotosCandidato1 * 100) / numeroEleitores;
        double percentualVotosCandidato2 = (numeroVotosCandidato2 * 100) / numeroEleitores;
        double percentualVotosCandidato3 = (numeroVotosCandidato3 * 100) / numeroEleitores;

        System.out.println("O percentual de votos do candidato 1 é " + percentualVotosCandidato1 + "%.");
        System.out.println("O percentual de votos do candidato 2 é " + percentualVotosCandidato2 + "%.");
        System.out.println("O percentual de votos do candidato 3 é " + percentualVotosCandidato3 + "%.");

        int candidatoVencedor = 0;
        if (numeroVotosCandidato1 > numeroVotosCandidato2 && numeroVotosCandidato1 > numeroVotosCandidato3) {
            candidatoVencedor = 1;
        } else if (numeroVotosCandidato2 > numeroVotosCandidato1 && numeroVotosCandidato2 > numeroVotosCandidato3) {
            candidatoVencedor = 2;
        } else {
            candidatoVencedor = 3;
        }

        System.out.println("O candidato vencedor foi o candidato " + candidatoVencedor + ".");
    }
}