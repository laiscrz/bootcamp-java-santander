package br.com.dio;

public class Telegram {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem com Telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem com Telegram");
    }

    // métodos privadas, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
