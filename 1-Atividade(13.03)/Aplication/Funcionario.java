public abstract class Funcionario {
    
    public double calSalario;
    public double comissao;
    
    public Funcionario(double calSalario, double comissao) {
        this.calSalario = calSalario;
        this.comissao = comissao;
    }

    public Funcionario(double calSalario) {
        this.calSalario = calSalario;
    }

    public double getCalSalario() {
        return calSalario;
    }

    public void setCalSalario(double calSalario) {
        this.calSalario = calSalario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}