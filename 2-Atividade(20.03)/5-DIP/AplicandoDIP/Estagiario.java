public class Estagiario implements FuncionarioInterface{
    private String nome;
    private double salario;

    public Estagiario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return 0; //Estagiário não recebe bônus
    }
}