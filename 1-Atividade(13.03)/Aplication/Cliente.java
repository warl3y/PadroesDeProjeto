public class Cliente extends Pessoa implements Autenticavel {

    public Cliente(String nome, int idade, String cpf, String endereco, String telefone) {
        super(nome, idade, cpf, endereco, telefone);
    }
    
    @Override
    public void login() {
        System.out.println("Cliente autenticado!");
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticação do Cliente realizada.");
    }

    @Override
    public void realizarAcao() {
        System.out.println("Cliente está navegando na plataforma.");
    }
    
}