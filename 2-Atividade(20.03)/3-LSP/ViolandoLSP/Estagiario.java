//Violando o LSP: Estagiário não tem um bônus válido, mas está herdando um método que deveria funcionar
class Estagiario extends FuncionarioInterface {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        throw new UnsupportedOperationException("Estagiário não recebe bônus!");
    }
}