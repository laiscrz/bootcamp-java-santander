package br.com.dio;

public class MSNMessenger extends MessageService {

    @Override
    public void enviarMensagem() {
        enviar();
    }

    @Override
    public void receberMensagem() {
        receber();
    }

}
