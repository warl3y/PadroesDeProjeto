import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comprador> compradores = Arrays.asList(
                new Comprador("João Silva", "123.456.789-00"),
                new Comprador("Maria Souza", "987.654.321-00"));

        PacoteViagemFacade pacote = new PacoteViagemFacade(
                compradores,
                "2A",
                "Executivo",
                "Luxo",
                "credito",
                4);

        pacote.imprimirResumo();
    }
}