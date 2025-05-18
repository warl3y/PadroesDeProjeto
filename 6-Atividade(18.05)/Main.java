import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ViolaoCache.carregarCache();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de violão:");
        System.out.println("classico, folk, flet, jumbo, 7cordas, 12cordas, 0, 00, 000");
        System.out.print("Digite sua escolha: ");
        String escolha = scanner.nextLine().toLowerCase();

        ViolaoPrototype violaoEscolhido = ViolaoCache.obterViolao(escolha);

        if (violaoEscolhido != null) {
            System.out.println("Você escolheu:");
            System.out.println(violaoEscolhido.exibirInfo());
        } else {
            System.out.println("Tipo de violão não encontrado.");
        }

        scanner.close();
    }
}
