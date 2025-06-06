public class Main {
    public static void main(String[] args) {
        configurarNotificacao("urgente", "Servidor caiu!");
        configurarNotificacao("normal", "Relatório disponível.");
    }

    public static void configurarNotificacao(String prioridade, String mensagem) {
        Notificacao notificacao = new NotificacaoSimples();

        if (prioridade.equals("urgente")) {
            notificacao = new SMSDecorator(notificacao);
            notificacao = new EmailDecorator(notificacao);
            notificacao = new SlackDecorator(notificacao);
        } else {
            notificacao = new EmailDecorator(notificacao);
        }

        System.out.println("Prioridade " + prioridade + ": " + notificacao.enviar(mensagem));
    }
}