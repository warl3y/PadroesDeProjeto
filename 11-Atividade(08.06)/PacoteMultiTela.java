public class PacoteMultiTela extends PacoteDecorator {
    public PacoteMultiTela(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Multi Tela";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}