package br.com.iphone.reprodutor;

public class ReprodutorMusical implements Reprodutor {

    @Override
    public void tocar() {
        System.out.println("Iniciando reprodução...");
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando reprodução...");
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música...");
        System.out.println("Música selecionada: " + musica);
    }
}
