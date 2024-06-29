package br.com.dio;

public class Circulo extends Forma {
    // Atributos
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação dos métodos abstratos
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
