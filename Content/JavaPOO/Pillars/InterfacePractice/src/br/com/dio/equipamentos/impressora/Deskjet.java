package br.com.dio.equipamentos.impressora;

public class Deskjet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo com Deskjet...");
    }
}
