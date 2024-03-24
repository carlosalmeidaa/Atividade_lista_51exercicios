import java.util.Scanner;

public class UsuarioSenha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String nomeUsuario = entrada.nextLine();

        System.out.println("Digite a senha: ");
        String senha = entrada.nextLine();

        while (senha.equals(nomeUsuario)) {
            System.out.println("A senha não pode ser igual ao nome de usuário!");
            System.out.println("Digite novamente a senha: ");
            senha = entrada.nextLine();
        }

        System.out.println("Nome de usuário: " + nomeUsuario);
        System.out.println("Senha: " + senha);
    }
}