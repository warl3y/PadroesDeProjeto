class FuncionarioInterface {
    protected String nome;
    protected double salario;

    public FuncionarioInterface(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.1;
    }
}