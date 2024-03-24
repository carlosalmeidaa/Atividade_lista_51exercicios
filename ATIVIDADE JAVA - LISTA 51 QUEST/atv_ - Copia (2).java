import java.util.Scanner;

public class ValidacaoDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        while (nome.length() < 3) {
            System.out.println("O nome deve ter pelo menos 3 caracteres!");
            System.out.println("Digite novamente o seu nome: ");
            nome = entrada.nextLine();
        }

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("A idade deve ser entre 0 e 150!");
            System.out.println("Digite novamente a sua idade: ");
            idade = entrada.nextInt();
        }

        System.out.println("Digite o seu salário: ");
        double salario = entrada.nextDouble();
        while (salario < 0) {
            System.out.println("O salário deve ser maior que 0!");
            System.out.println("Digite novamente o seu salário: ");
            salario = entrada.nextDouble();
        }

        System.out.println("Digite o seu sexo (f/m): ");
        String sexo = entrada.next();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("O sexo deve ser f ou m!");
            System.out.println("Digite novamente o seu sexo: ");
            sexo = entrada.next();
        }

        System.out.println("Digite o seu estado civil (s/c/v/d): ");
        String estadoCivil = entrada.next();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
            System.out.println("O estado civil deve ser s, c, v ou d!");
            System.out.println("Digite novamente o seu estado civil: ");
            estadoCivil = entrada.next();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}