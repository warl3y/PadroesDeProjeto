import java.util.ArrayList;
import java.util.List;

class Plataforma {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Conteudo> catalogo = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarConteudo(Conteudo conteudo) {
        catalogo.add(conteudo);
        notificarUsuarios(conteudo);
    }

    private void notificarUsuarios(Conteudo conteudo) {
        for (Usuario usuario : usuarios) {
            if (usuario.estaInscritoEm(conteudo.getGenero())) {
                usuario.notificar(conteudo);
            }
        }
    }
}