package br.com.dio;

public class Telegram extends MessageService{

    @Override
    public void enviarMensagem() {
        enviar();
    }

    @Override
    public void receberMensagem() {
        receber();
    }
}
