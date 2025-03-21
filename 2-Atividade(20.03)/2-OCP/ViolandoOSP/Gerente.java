class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        return salario * 0.2;
    }
}