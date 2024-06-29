package br.com.dio.equipamentos.impressora;

public class Laserjet implements Impressora {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo com Laserjet...");
    }
}
