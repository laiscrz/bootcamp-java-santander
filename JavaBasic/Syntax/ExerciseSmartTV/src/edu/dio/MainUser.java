package edu.dio;

public class MainUser {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        // visualizando estado atual
        System.out.println("-----------------STATUS ATUAL-----------------");
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

    }
}
