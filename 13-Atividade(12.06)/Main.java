public class Main {
    public static void main(String[] args) {
        // 1. Criando a plataforma
        Plataforma plataforma = new Plataforma();

        // 2. Criando os usuários
        Usuario ana = new Usuario("Ana");
        Usuario bruno = new Usuario("Bruno");
        Usuario clara = new Usuario("Clara");
        Usuario daniel = new Usuario("Daniel");
        Usuario estela = new Usuario("Estela");

        // 3. Definindo os interesses por gênero
        ana.inscreverGenero(Genero.COMEDIA);
        ana.inscreverGenero(Genero.ACAO);

        bruno.inscreverGenero(Genero.TERROR);

        clara.inscreverGenero(Genero.FICCAO);
        clara.inscreverGenero(Genero.COMEDIA);

        daniel.inscreverGenero(Genero.ACAO);
        daniel.inscreverGenero(Genero.FICCAO);
        daniel.inscreverGenero(Genero.TERROR);

        estela.inscreverGenero(Genero.ANIME);
        estela.inscreverGenero(Genero.COMEDIA);

        // 4. Registrando os usuários na plataforma
        plataforma.registrarUsuario(ana);
        plataforma.registrarUsuario(bruno);
        plataforma.registrarUsuario(clara);
        plataforma.registrarUsuario(daniel);
        plataforma.registrarUsuario(estela);

        // 5. Adicionando novos conteúdos à plataforma
        plataforma.adicionarConteudo(new Conteudo("Explosões em Marte", Genero.ACAO));
        plataforma.adicionarConteudo(new Conteudo("Comédia no Espaço", Genero.COMEDIA));
        plataforma.adicionarConteudo(new Conteudo("Noite Macabra", Genero.TERROR));
        plataforma.adicionarConteudo(new Conteudo("Robôs Pensantes", Genero.FICCAO));
        plataforma.adicionarConteudo(new Conteudo("Anime dos Ninjas", Genero.ANIME));
    }
}