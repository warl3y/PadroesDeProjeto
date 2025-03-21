class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        return salario * 0.1;
    }
}