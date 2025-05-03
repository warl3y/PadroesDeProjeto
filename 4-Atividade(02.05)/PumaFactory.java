class PumaFactory implements Fabrica {
    public CamisaEsportiva criarCamisa() {
        return new CamisaBotafogo();
    }
}