package br.com.dio;

public abstract class MessageService {
    
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

    
}
