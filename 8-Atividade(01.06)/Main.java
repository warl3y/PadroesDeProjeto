import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível do cliente (bronze, prata, ouro, platina): ");
        String nivel = scanner.nextLine();

        try {
            CaixaAssinatura caixa = new CaixaAssinatura(nivel);
            caixa.exibirConteudo();
        } catch (IllegalArgumentException e) {
            System.out.println("Nível inválido. Tente novamente com: bronze, prata, ouro ou platina.");
        }

        scanner.close();
    }
}