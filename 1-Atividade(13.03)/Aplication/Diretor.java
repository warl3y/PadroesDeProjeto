import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario implements Autenticavel, Fornecedor, Departamento {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public Diretor(double calSalario) {
        super(calSalario);
    }

    @Override
    public double getCalSalario() {
        return super.getCalSalario();
    }

    @Override
    public void setCalSalario(double calSalario) {
        super.setCalSalario(calSalario);
    }

    @Override
    public void login() {
        System.out.println("Diretor autenticado!");
    }

    @Override
    public void realizarPedido() {
        System.out.println("Diretor realizou um pedido.");
    }

    @Override
    public void criarDepartamento() {
        System.out.println("Departamento criado pelo Diretor.");
    }

    @Override
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

}