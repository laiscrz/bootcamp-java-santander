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

    public void encerrar() {
        System.out.println("Encerrando chamada...");
        System.out.println("Chamada encerrada.");
    }

}
