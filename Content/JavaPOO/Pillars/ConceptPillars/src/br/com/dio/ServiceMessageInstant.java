package br.com.dio;

public abstract class ServiceMessageInstant {

    public abstract void enviarMensagem(); // não tem corpo

    public abstract void receberMensagem(); // não tem corpo

    // private -> Encapsulamento
    // métodos privadas, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }

    // protected -> somente filhos reconhecem
    protected void enviar() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    protected void receber() {
        System.out.println("Recebendo mensagem");
    }
}
