package br.com.dio;

public class Facebook {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem com Facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem com Facebook");
    }

    // métodos privadas, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
