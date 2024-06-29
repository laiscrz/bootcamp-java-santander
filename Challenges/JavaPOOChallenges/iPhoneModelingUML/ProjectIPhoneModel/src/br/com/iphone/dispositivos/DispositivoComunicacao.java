package br.com.iphone.dispositivos;

public abstract class DispositivoComunicacao {

    public abstract void ligar(String numero);

    public abstract void atender();

    public abstract void encerrar();

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("Por favor, deixe sua mensagem após o sinal...");
    }
}
