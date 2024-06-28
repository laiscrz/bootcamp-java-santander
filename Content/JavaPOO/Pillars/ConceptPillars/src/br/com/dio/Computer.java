package br.com.dio;

public class Computer {

    public static void main(String[] args) {
        
        //abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		// msn.validarConectadoInternet(); -> private (Encapsulamento)
		msn.enviarMensagem();
		// msn.salvarHistoricoMensagem(); -> private (Encapsulamento)
		
		msn.receberMensagem();
    }
}
