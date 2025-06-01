class Carro {
    String tipo;
    double preco;

    Carro(String tipo) {
        this.tipo = tipo;
        this.preco = calcularPreco(tipo);
    }

    private double calcularPreco(String tipo) {
        if ("Executivo".equalsIgnoreCase(tipo))
            return 150 * 2;
        if ("Luxo".equalsIgnoreCase(tipo))
            return 150 * 4;
        return 150;
    }
}