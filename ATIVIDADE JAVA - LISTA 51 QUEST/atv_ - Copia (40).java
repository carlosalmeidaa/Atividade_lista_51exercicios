import java.util.Scanner;

public class Eleicao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaração das variáveis
        int voto, totalVotos1 = 0, totalVotos2 = 0, totalVotos3 = 0, totalVotos4 = 0, totalVotosNulos = 0, totalVotosBrancos = 0;

        // Entrada de dados
        do {
            System.out.println("Informe o seu voto: ");
            voto = leitor.nextInt();

            // Processamento
            switch (voto) {
                case 1:
                    totalVotos1++;
                    break;
                case 2:
                    totalVotos2++;
                    break;
                case 3:
                    totalVotos3++;
                    break;
                case 4:
                    totalVotos4++;
                    break;
                case 5:
                    totalVotosNulos++;
                    break;
                case 6:
                    totalVotosBrancos++;
                    break;
                default:
                    break;
            }
        } while (voto != 0);

        // Saída de dados
        System.out.println("O total de votos para o candidato 1 é " + totalVotos1);
        System.out.println("O total de votos para o candidato 2 é " + totalVotos2);
        System.out.println("O total de votos para o candidato 3 é " + totalVotos3);
        System.out.println("O total de votos para o candidato 4 é " + totalVotos4);
        System.out.println("O total de votos nulos é " + totalVotosNulos);
        System.out.println("O total de votos em branco é " + totalVotosBrancos);

        // Cálculo da percentagem de votos nulos sobre o total de votos
        double percentagemVotosNulos = (totalVotosNulos * 100) / (totalVotos1 + totalVotos2 + totalVotos3 + totalVotos4 + totalVotosNulos + totalVotosBrancos);
        System.out.println("A percentagem de votos nulos é " + percentagemVotosNulos + "%");

        // Cálculo da percentagem de votos em branco sobre o total de votos
        double percentagemVotosBrancos = (totalVotosBrancos * 100) / (totalVotos1 + totalVotos2 + totalVotos3 + totalVotos4 + totalVotosNulos + totalVotosBrancos);
        System.out.println("A percentagem de votos em branco é " + percentagemVotosBrancos + "%");
    }
}