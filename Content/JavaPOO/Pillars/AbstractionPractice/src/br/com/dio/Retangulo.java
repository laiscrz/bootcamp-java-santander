package br.com.dio;

public class Retangulo extends Forma {
    // Atributos
    private double ladoA;
    private double ladoB;

    // Construtor
    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    // Implementação dos métodos abstratos
    @Override
    public double calcularArea() {
        double resultado = ladoA * ladoB;
        return resultado;
    }

    @Override
    public double calcularPerimetro() {
        double resultado = 2 * (ladoA + ladoB);
        return resultado;
    }
}
