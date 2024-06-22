package edu.dio;

public class SmartTV {

    // características: ligada (boolean), canal (int) e volume (int);
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    // MÉTODOS -> LIGADA (BOOLEAN)
    // Método para ligar a TV
    public void ligarTV() {
        ligada = true;
    };

    // Método para desligar a TV
    public void desligarTV() {
        ligada = false;
    };

    // MÉTODOS -> VOLUME (INT)
    // Método para aumentar o volume
    public void aumentarVolume() {
        volume++;
    };

    // Método para diminuir o volume
    public void diminuirVolume() {
        volume--;
    };

    // MÉTODOS -> CANAL (INT)
    // Método para mudar para um canal específico
    public void mudarCanalEscolhido(int canalEscolhido){
        canal = canalEscolhido;
    };

    // Método para mudar para o próximo canal
    public void mudarCanalProximo(){
        canal++;
    }

    // Método para mudar para o canal anterior
    public void mudarCanalAnterior() {
        canal--;
    }
}
