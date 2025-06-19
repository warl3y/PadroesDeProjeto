class IteradorDeCarros implements Iterador {
    private CarrosEsportivos colecao;
    private int posicao = 0;

    public IteradorDeCarros(CarrosEsportivos colecao) {
        this.colecao = colecao;
    }

    @Override
    public boolean temProximo() {
        return posicao < colecao.getQuantidade();
    }

    @Override
    public String proximo() {
        return colecao.getCarros()[posicao++];
    }
}