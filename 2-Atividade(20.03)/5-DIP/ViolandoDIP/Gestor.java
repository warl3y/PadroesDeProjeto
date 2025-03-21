public class Gestor {
    private Funcionario funcionario;

    public Gestor(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void avaliarFuncionario() {
        System.out.println("Avaliação do funcionário: " + funcionario.calcularBonus());
    }
}
