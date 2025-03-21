public class Gerente implements FuncionarioComBonusInterface, FuncionarioComProjetosInterface {
    public void gerenciarProjetos() {
        System.out.println("Bônus do gerente: 30%");
    }


    public void calcularBonus() {
        System.out.println("Gerenciando projetos.");
    }
}