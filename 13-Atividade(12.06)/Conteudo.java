class Conteudo {
    private String titulo;
    private Genero genero;

    public Conteudo(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }
}