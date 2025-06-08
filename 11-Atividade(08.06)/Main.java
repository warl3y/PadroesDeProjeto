public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new AssinaturaBasica();

        assinatura = new PacoteMultiTela(assinatura);
        assinatura = new PacoteFreteGratis(assinatura);
        assinatura = new PacoteCashBack(assinatura);

        System.out.println("Descrição: " + assinatura.getDescricao());
        System.out.println("Preço total: R$" + String.format("%.2f", assinatura.getPreco()));
    }
}