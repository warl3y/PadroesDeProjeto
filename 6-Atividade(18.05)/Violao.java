public abstract class Violao implements ViolaoPrototype, Cloneable {
    protected String modelo;
    protected String cordas;
    protected String tipo;
    protected String indicacao;

    @Override
    public ViolaoPrototype clone() {
        try {
            return (ViolaoPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String exibirInfo() {
        return "Modelo: " + modelo + " | Cordas: " + cordas + " | Tipo: " + tipo + " | Indicado para: " + indicacao;
    }
}