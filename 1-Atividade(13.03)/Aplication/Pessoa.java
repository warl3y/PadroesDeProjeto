public abstract class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, int idade, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado para: " + novoEndereco);
    }

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Endereço atualizado para: " + novoTelefone);
    }

    public abstract void autenticar();

    public abstract void realizarAcao();

}
