package br.com.iphone.dispositivos;

public abstract class DispositivoComunicacao {

    public abstract void ligar(String numero);

    public abstract void atender();

    public abstract void encerrar();

    public abstract void iniciarCorreioVoz();
}
