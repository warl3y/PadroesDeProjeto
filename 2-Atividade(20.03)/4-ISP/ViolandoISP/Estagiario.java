public class Estagiario {
    public void calcularBonus() {
        System.out.println("Bônus do estagiário: 0%");
    }

    //Estagiário não gerencia projetos, então precisa implementar esse método, mas não faz sentido
    public void gerenciarProjetos() {
        throw new UnsupportedOperationException("Estagiário não gerencia projetos.");
    }
}
