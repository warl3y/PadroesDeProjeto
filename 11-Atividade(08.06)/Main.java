import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assinatura assinatura = new AssinaturaBasica();
        ArrayList<Integer> pacotes = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha um pacote para adicionar ou 0 para finalizar:");
            System.out.println("1 - Multi Tela (R$19,99)");
            System.out.println("2 - Frete Grátis (R$9,99)");
            System.out.println("3 - Caixa Surpresa (R$29,99)");
            System.out.println("4 - Cartão Platinum (R$49,99)");
            System.out.println("5 - Cash Back (R$19,99)");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            if (pacotes.contains(opcao)) {
                System.out.println("Esse pacote já foi adicionado.");
                continue;
            }

            if (opcao == 1) {
                assinatura = new PacoteMultiTela(assinatura);
                pacotes.add(1);
            } else if (opcao == 2) {
                assinatura = new PacoteFreteGratis(assinatura);
                pacotes.add(2);
            } else if (opcao == 3) {
                assinatura = new PacoteCaixaSurpresa(assinatura);
                pacotes.add(3);
            } else if (opcao == 4) {
                assinatura = new PacoteCartaoPlatinum(assinatura);
                pacotes.add(4);
            } else if (opcao == 5) {
                assinatura = new PacoteCashBack(assinatura);
                pacotes.add(5);
            } else {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("\nResumo da Assinatura:");
        System.out.println("Descrição: " + assinatura.getDescricao());
        System.out.printf("Preço total: R$%.2f\n", assinatura.getPreco());

        sc.close();
    }
}