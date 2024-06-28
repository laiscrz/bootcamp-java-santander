package br.com.dio;

public class Facebook extends ServiceMessageInstant {
    
    @Override
    public void enviarMensagem() {
        enviar();
    }

    @Override
    public void receberMensagem() {
        receber();
    }

}
