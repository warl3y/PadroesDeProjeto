class NikeFactory implements Fabrica {
    public CamisaEsportiva criarCamisa() {
        return new CamisaBrasil();
    }
}