//Aplicando o LSP: Estagiário agora têm um bônus válido, mesmo retornando 0
public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        return 0; //Em vez de lançar uma exceção, apenas retorna zero
    }
}
