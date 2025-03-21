class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus() {
        //Sempre que um novo cargo é adicionado, precisa mudar essa classe
        if (cargo.equals("Gerente")) {
            return salario * 0.2;
        } else if (cargo.equals("Desenvolvedor")) {
            return salario * 0.1;
        } else {
            return salario * 0.05;
        }
    }
}