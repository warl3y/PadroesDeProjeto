class Hotel {
    String tipo;
    double preco;

    Hotel(String tipo, int pessoas) {
        this.tipo = tipo;
        this.preco = calcularPreco(tipo, pessoas);
    }

    private double calcularPreco(String tipo, int pessoas) {
        double base = 200;
        if ("Executivo".equalsIgnoreCase(tipo))
            return base * 1.5 * pessoas;
        if ("Suite".equalsIgnoreCase(tipo))
            return base * 1.5 * 3 * pessoas;
        return base * pessoas;
    }
}