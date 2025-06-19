public class Main {
    public static void main(String[] args) {
        CarrosEsportivos garagem = new CarrosEsportivos();
        garagem.adicionar("Ferrari F8");
        garagem.adicionar("Lamborghini Huracán");
        garagem.adicionar("Porsche 911 GT3");

        Iterador iterador = garagem.criarIterador();
        while (iterador.temProximo()) {
            System.out.println("Carro: " + iterador.proximo());
        }
    }
}