class UmbroFactory implements Fabrica {
    public CamisaEsportiva criarCamisa() {
        return new CamisaFluminense();
    }
}
