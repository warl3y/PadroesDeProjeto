class SistemaLogin {
    private static SistemaLogin instancia;
    private final String usuarioFuncionario = "funcionario";
    private final String senhaFuncionario = "senha123";

    private SistemaLogin() {}

    public static SistemaLogin getInstancia() {
        if (instancia == null) {
            instancia = new SistemaLogin();
        }
        return instancia;
    }

    public boolean autenticar(String usuario, String senha, String codigoDigitado, String codigoGerado) {
        return usuario.equals(usuarioFuncionario)
                && senha.equals(senhaFuncionario)
                && codigoDigitado.equals(codigoGerado);
    }
}