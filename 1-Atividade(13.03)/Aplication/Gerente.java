import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario implements Autenticavel, Fornecedor, Departamento{

    private List<Funcionario> funcionarios = new ArrayList<>();

    public Gerente(double calSalario) {
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
        System.out.println("Gerente autenticado!");
    }

    @Override
    public void realizarPedido() {
        System.out.println("Gerente realizou um pedido!");
    }

    @Override
    public void criarDepartamento() {
        System.out.println("Departamento criado pelo Gerente.");
    }

    @Override
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
  
}