package br.com.dio;

public class ComputerMain {
    public static void main(String[] args) {

        System.out.println("\n----------MSN----------");
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        // msn.validarConectadoInternet(); -> private (Encapsulamento)
        msn.enviarMensagem();
        // msn.salvarHistoricoMensagem(); -> private (Encapsulamento)
        msn.receberMensagem();

        System.out.println("\n----------FACEBOOK----------");
        Facebook fbm = new Facebook();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("\n----------TELEGRAM----------");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
