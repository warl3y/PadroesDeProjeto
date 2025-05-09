class SamsungFactory implements HeadphoneFactory {
    public Headphone createInEar() {
        return new SamsungInEar();
    }

    public Headphone createOverEar() {
        return new SamsungOverEar();
    }
}