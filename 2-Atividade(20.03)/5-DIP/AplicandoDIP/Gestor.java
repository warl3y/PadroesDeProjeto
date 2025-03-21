public class Gestor {
    private FuncionarioInterface funcionario;

    //Agora o Gestor depende da abstração, não de uma classe concreta
    public Gestor(FuncionarioInterface funcionario) {
        this.funcionario = funcionario;
    }

    public void avaliarFuncionario() {
        System.out.println("Avaliação do funcionário: " + funcionario.calcularBonus());
    }
}