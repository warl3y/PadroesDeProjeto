class SonyFactory implements HeadphoneFactory {
    public Headphone createInEar() {
        return new SonyInEar();
    }

    public Headphone createOverEar() {
        return new SonyOverEar();
    }
}