package br.com.dio;

public class Telegram extends ServiceMessageInstant{

    @Override
    public void enviarMensagem() {
        enviar();
    }

    @Override
    public void receberMensagem() {
        receber();
    }
}
