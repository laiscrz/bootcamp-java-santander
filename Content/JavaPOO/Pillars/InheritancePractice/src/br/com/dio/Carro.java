package br.com.dio;

// extends -> herda da classe veiculo
public class Carro extends Veiculo {

    private int numeroDePortas;

    // Construtor que inicializa atributos de Veiculo e adiciona atributo próprio
    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo); // Chama o construtor de Veiculo
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    // Método específico para Carro
    public void buzinar() {
        System.out.println("Carro buzinou!");
    }

}
