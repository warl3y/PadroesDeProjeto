import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaLogin sistema = SistemaLogin.getInstancia();

        System.out.println("=== Tela de Login - Funcionário ===");

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        String codigoAntiBot = gerarCodigoAntiBot();
        System.out.println("Digite o código abaixo para confirmar que você não é um robô: ");
        System.out.println(">>> " + codigoAntiBot + " <<<");

        System.out.print("Código: ");
        String codigoDigitado = scanner.nextLine();

        boolean acessoPermitido = sistema.autenticar(usuario, senha, codigoDigitado, codigoAntiBot);

        if (acessoPermitido) {
            System.out.println("Acesso liberado. Bem-vindo, funcionário!");
        } else {
            System.out.println("Acesso negado. Verifique suas credenciais ou o código.");
        }

        scanner.close();
    }

    public static String gerarCodigoAntiBot() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }
        
        return codigo.toString();
    }
}