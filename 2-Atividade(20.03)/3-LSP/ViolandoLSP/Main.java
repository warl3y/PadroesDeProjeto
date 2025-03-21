public class Main {
    public static void main(String[] args) {
        FuncionarioInterface funcionario = new Estagiario("João", 2000);
        System.out.println(funcionario.calcularBonus()); //O código vai quebrar
    }
}