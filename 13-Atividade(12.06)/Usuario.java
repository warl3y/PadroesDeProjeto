import java.util.HashSet;
import java.util.Set;

class Usuario implements Observer {
    private String nome;
    private Set<Genero> interesses = new HashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void inscreverGenero(Genero genero) {
        interesses.add(genero);
    }

    public void desinscreverGenero(Genero genero) {
        interesses.remove(genero);
    }

    public boolean estaInscritoEm(Genero genero) {
        return interesses.contains(genero);
    }

    @Override
    public void notificar(Conteudo conteudo) {
        System.out.println("Olá " + nome + ", novo conteúdo disponível: " + conteudo.getTitulo() + " (" + conteudo.getGenero() + ")");
    }
}