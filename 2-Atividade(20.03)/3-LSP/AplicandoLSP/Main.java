public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Estagiario("João", 2000);
        System.out.println(funcionario.calcularBonus()); //Retorna 0, está funcionando corretamente
    }
}