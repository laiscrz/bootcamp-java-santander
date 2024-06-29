package br.com.dio;

// extends -> herda da classe veiculo
public class Moto extends Veiculo {

    private int cilindradas;

    // Construtor que inicializa atributos de Veiculo e adiciona atributo próprio
    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo); // Chama o construtor de Veiculo
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Método específico para Moto
    public void acelerar() {
        System.out.println("Moto acelerou!");
    }
}
