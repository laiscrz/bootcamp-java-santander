package edu.dio;

public class MainUser {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        // visualizando estado atual
        System.out.println("-----------------STATUS ATUAL-----------------");
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("----------------------------------");

        // Ligar a TV
        System.out.println("Ligando a TV...");
        smartTV.ligarTV();
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("----------------------------------");

        // Aumentar o volume 3 vezes
        System.out.println("Aumentando o volume...");
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("----------------------------------");

        // Diminuir o volume 1 vez
        System.out.println("Diminuindo o volume...");
        smartTV.diminuirVolume();
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("----------------------------------");

        // Mudar para o próximo canal
        System.out.println("Mudando para o próximo canal...");
        smartTV.mudarCanalProximo();
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("----------------------------------");

        // Mudar para o canal anterior
        System.out.println("Mudando para o canal anterior...");
        smartTV.mudarCanalAnterior();
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("----------------------------------");

        // Mudar para um canal específico
        int canalEscolhido = 5;
        System.out.println("Mudando para o canal " + canalEscolhido + "...");
        smartTV.mudarCanalEscolhido(canalEscolhido);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("----------------------------------");

        // Desligar a TV
        System.out.println("Desligando a TV...");
        smartTV.desligarTV();
        System.out.println("TV ligada? " + smartTV.ligada);

        // Visualizando estado final
        System.out.println("-----------------STATUS FINAL-----------------");
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        System.out.println("----------------------------------");

    }
}
