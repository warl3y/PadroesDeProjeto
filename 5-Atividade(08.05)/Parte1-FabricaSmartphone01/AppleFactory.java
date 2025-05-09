class AppleFactory implements SmartphoneFactory {
    public Smartphone criarModeloA() {
        return new iPhone14();
    }

    public Smartphone criarModeloB() {
        return new iPhoneSE();
    }
}