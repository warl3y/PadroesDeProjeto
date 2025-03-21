class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    //Essa função deveria estar em outra classe, porque gera relatórios (responsabilidade diferente)
    public void gerarRelatorio() {
        System.out.println("Relatório do funcionário: " + nome);
        System.out.println("Salário anual: " + calcularSalarioAnual());
    }
}