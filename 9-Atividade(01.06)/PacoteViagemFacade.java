import java.util.List;

class PacoteViagemFacade {
    List<Comprador> compradores;
    Voo voo;
    Hotel hotel;
    Carro carro;
    Pagamento pagamento;

    PacoteViagemFacade(List<Comprador> compradores, String poltrona, String tipoQuarto, String tipoCarro,
        String formaPagamento, int parcelas) {
        this.compradores = compradores;
        this.voo = new Voo(poltrona);
        this.hotel = new Hotel(tipoQuarto, compradores.size());
        this.carro = new Carro(tipoCarro);
        double total = voo.preco * compradores.size() + hotel.preco + carro.preco;
        this.pagamento = new Pagamento(formaPagamento, total, parcelas);
    }

    void imprimirResumo() {
        System.out.println("=== DADOS DOS COMPRADORES ===");
        for (Comprador c : compradores) {
            System.out.println("Nome: " + c.nome + ", CPF: " + c.cpf);
        }
        System.out.println("\n=== DETALHES DA COMPRA ===");
        System.out.println("Poltrona: " + voo.poltrona);
        System.out.println("Tipo de Quarto: " + hotel.tipo);
        System.out.println("Tipo de Carro: " + carro.tipo);
        System.out.println("Forma de Pagamento: " + pagamento.forma);
        System.out.printf("Valor Final do Pacote: R$ %.2f\n", pagamento.total);
    }
}