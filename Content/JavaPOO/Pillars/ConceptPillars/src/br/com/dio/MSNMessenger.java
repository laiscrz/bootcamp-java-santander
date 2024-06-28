package br.com.dio;

public class MSNMessenger extends ServiceMessageInstant {

    @Override
    public void enviarMensagem() {
        enviar();
    }

    @Override
    public void receberMensagem() {
        receber();
    }

}
