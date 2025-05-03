class AdidasFactory implements Fabrica {
    public CamisaEsportiva criarCamisa() {
        return new CamisaFlamengo();
    }
}