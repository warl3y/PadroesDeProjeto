class CarrosEsportivos implements ColecaoDeCarros {
    private String[] carros = new String[10];
    private int quantidade = 0;

    public void adicionar(String carro) {
        if (quantidade < carros.length) {
            carros[quantidade] = carro;
            quantidade++;
        }
    }

    public String[] getCarros() {
        return carros;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorDeCarros(this);
    }
}