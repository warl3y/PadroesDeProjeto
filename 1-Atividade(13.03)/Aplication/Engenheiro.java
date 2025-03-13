public class Engenheiro extends Funcionario implements Fornecedor {

    public Engenheiro(double calSalario, double comissao) {
        super(calSalario, comissao);
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
    public double getComissao() {
        return super.getComissao();
    }

    @Override
    public void setComissao(double comissao) {
        super.setComissao(comissao);
    }

    @Override
    public void realizarPedido() {
        System.out.println("Engenheiro realizou um pedido.");
    }
    
}