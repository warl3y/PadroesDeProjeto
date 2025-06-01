class Pagamento {
    String forma;
    double total;

    Pagamento(String forma, double total, int parcelas) {
        this.forma = forma;
        this.total = calcularValorFinal(forma, total, parcelas);
    }

    private double calcularValorFinal(String forma, double valor, int parcelas) {
        switch (forma.toLowerCase()) {
            case "pix":
                return valor * 0.9;
            case "boleto":
                return valor * 0.95;
            case "credito":
                if (parcelas > 1) {
                    double juros = 0.0399 * (parcelas - 1);
                    return valor * (1 + juros);
                }
                return valor;
            default:
                return valor;
        }
    }
}