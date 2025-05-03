class KappaFactory implements Fabrica {
    public CamisaEsportiva criarCamisa() {
        return new CamisaVasco();
    }
}
