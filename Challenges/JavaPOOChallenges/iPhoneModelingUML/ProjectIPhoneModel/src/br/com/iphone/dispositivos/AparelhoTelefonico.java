package br.com.iphone.dispositivos;

public class AparelhoTelefonico extends DispositivoComunicacao {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        System.out.println("Chamando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void encerrar() {
        System.out.println("Encerrando chamada...");
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("Por favor, deixe sua mensagem após o sinal...");
    }

}
