package br.com.dio;

public class Computer {

    public static void main(String[] args) {
        
		System.out.println("----------MSN----------");
        //abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		// msn.validarConectadoInternet(); -> private (Encapsulamento)
		msn.enviarMensagem();
		// msn.salvarHistoricoMensagem(); -> private (Encapsulamento)
		msn.receberMensagem();

		System.out.println("----------FACEBOOK----------");
		Facebook fbm = new Facebook();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		System.out.println("----------TELEGRAM----------");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
    }
}
