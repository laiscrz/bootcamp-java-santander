package br.com.dio;

import java.util.Scanner;

public class Computer {

	public static void main(String[] args) {

		ServiceMessageInstant sm = null;

		/*
		 * NÃO SE SABE QUAL APP
		 * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um aplicativo (msn, fbm, tlg): ");
		String appEscolhido = scanner.nextLine();

		if (appEscolhido.equals("msn"))
			sm = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			sm = new Facebook();
		else if (appEscolhido.equals("tlg"))
			sm = new Telegram();
		if (sm != null) {
			sm.enviarMensagem();
			sm.receberMensagem();
		} else {
			System.out.println("Nenhum aplicativo válido foi escolhido.");
		}

		scanner.close();
	}
}
