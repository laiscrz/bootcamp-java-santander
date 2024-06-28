package br.com.dio;

public class Facebook extends MessageService {
    
    @Override
    public void enviarMensagem() {
        enviar();
    }

    @Override
    public void receberMensagem() {
        receber();
    }

}
