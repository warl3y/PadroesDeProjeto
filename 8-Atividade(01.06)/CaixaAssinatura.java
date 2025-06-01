import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class CaixaAssinatura {
    private final String nivel;
    private final int limiteItens;
    private final List<Item> itensDisponiveis = new ArrayList<>();
    private final List<Item> itensDaCaixa = new ArrayList<>();
    private final Random random = new Random();

    public CaixaAssinatura(String nivel) {
        this.nivel = nivel.toUpperCase();
        this.limiteItens = definirLimite(this.nivel);
        carregarItensDisponiveis();
        gerarItensAleatorios();
    }

    private int definirLimite(String nivel) {
        switch (nivel) {
            case "BRONZE": return 3;
            case "PRATA": return 5;
            case "OURO": return 7;
            case "PLATINA": return 10;
            default: throw new IllegalArgumentException("Nível inválido: " + nivel);
        }
    }

    private void carregarItensDisponiveis() {
        itensDisponiveis.add(new Item("Quadrinho", 15.0));
        itensDisponiveis.add(new Item("Chaveiro", 5.0));
        itensDisponiveis.add(new Item("Busto", 10.0));
        itensDisponiveis.add(new Item("Adesivo", 1.0));
        itensDisponiveis.add(new Item("Poster", 25.0));
        itensDisponiveis.add(new Item("Camiseta", 25.0));
        itensDisponiveis.add(new Item("Caneta", 3.0));
        itensDisponiveis.add(new Item("Miniatura", 20.0));
    }

    private void gerarItensAleatorios() {
        for (int i = 0; i < limiteItens; i++) {
            int index = random.nextInt(itensDisponiveis.size());
            itensDaCaixa.add(itensDisponiveis.get(index));
        }
    }

    public void exibirConteudo() {
        System.out.println("Caixa do cliente nível " + nivel + ":");
        Map<String, Integer> contagem = new LinkedHashMap<>();
        double total = 0.0;

        for (Item item : itensDaCaixa) {
            contagem.put(item.getNome(), contagem.getOrDefault(item.getNome(), 0) + 1);
            total += item.getPreco();
        }

        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println("- " + entrada.getValue() + "x " + entrada.getKey());
        }

        System.out.printf("Valor total da caixa: R$ %.2f%n", total);
    }
}