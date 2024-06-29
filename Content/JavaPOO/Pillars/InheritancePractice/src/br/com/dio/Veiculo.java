package br.com.dio;

// Classe base Veiculo com atributos e métodos genéricos
public class Veiculo {

    private String marca;
    private String modelo;

    // Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método ligar genérico
    public void ligar() {
        System.out.println("Veículo ligado.");
    }

    // Método desligar genérico
    public void desligar() {
        System.out.println("Veículo desligado.");
    }
}
