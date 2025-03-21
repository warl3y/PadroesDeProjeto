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

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}

// Classe separada para geração de relatórios
class GeradorDeRelatorio {
    public void gerarRelatorio(Funcionario funcionario) {
        System.out.println("Relatório do funcionário: " + funcionario.getNome());
        System.out.println("Salário anual: " + funcionario.calcularSalarioAnual());
    }
}