import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o time:");
        System.out.println("1 - Brasil");
        System.out.println("2 - Flamengo");
        System.out.println("3 - Botafogo");
        System.out.println("4 - Fluminense");
        System.out.println("5 - Vasco");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        Fabrica fabrica = null;

        switch (opcao) {
            case 1: fabrica = new NikeFactory(); break;
            case 2: fabrica = new AdidasFactory(); break;
            case 3: fabrica = new PumaFactory(); break;
            case 4: fabrica = new UmbroFactory(); break;
            case 5: fabrica = new KappaFactory(); break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        CamisaEsportiva camisa = fabrica.criarCamisa();
        camisa.exibirDetalhes();

        scanner.close();
    }
}