class Voo {
    String poltrona;
    double preco;

    Voo(String poltrona) {
        this.poltrona = poltrona;
        this.preco = calcularPreco(poltrona);
    }

    private double calcularPreco(String poltrona) {
        int fileira = Integer.parseInt(poltrona.substring(0, poltrona.length() - 1));
        double base = 500;
        if (fileira <= 3)
            return base * 2.5 * 1.5;
        else if (fileira <= 8)
            return base * 2.5;
        else
            return base;
    }
}
