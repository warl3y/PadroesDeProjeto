public class AssinaturaBasica implements Assinatura {
    @Override
    public String getDescricao() {
        return "Assinatura básica (1 dispositivo)";
    }

    @Override
    public double getPreco() {
        return 9.99;
    }
}