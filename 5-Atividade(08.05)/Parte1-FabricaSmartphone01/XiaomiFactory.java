class XiaomiFactory implements SmartphoneFactory {
    public Smartphone criarModeloA() {
        return new RedmiNote();
    }

    public Smartphone criarModeloB() {
        return new Mi11();
    }
}