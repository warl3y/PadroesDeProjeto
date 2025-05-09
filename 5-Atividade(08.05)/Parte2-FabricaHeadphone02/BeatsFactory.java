class BeatsFactory implements HeadphoneFactory {
    public Headphone createInEar() {
        return new BeatsInEar();
    }

    public Headphone createOverEar() {
        return new BeatsOverEar();
    }
}