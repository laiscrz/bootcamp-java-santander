package br.com.dio;

public class ConcessionariaMain {

    public static void main(String[] args) {
        System.out.println("------------CARRO------------");
        // Criando uma instância de Carro
        Carro meuCarro = new Carro("Chevrolet", "Cruze", 4);
        meuCarro.ligar(); // Método herdado de Veiculo
        meuCarro.buzinar(); // Método específico de Carro

        System.out.println("Marca do Carro: " + meuCarro.getMarca());
        System.out.println("Modelo do Carro: " + meuCarro.getModelo());
        System.out.println("Número de portas: " + meuCarro.getNumeroDePortas());
        System.out.println();

        System.out.println("------------MOTO------------");
        // Criando uma instância de Moto
        Moto minhaMoto = new Moto("Honda", "CBR 600RR", 600);
        minhaMoto.ligar(); // Método herdado de Veiculo
        minhaMoto.acelerar(); // Método específico de Moto

        System.out.println("Marca da Moto: " + minhaMoto.getMarca());
        System.out.println("Modelo da Moto: " + minhaMoto.getModelo());
        System.out.println("Cilindradas da Moto: " + minhaMoto.getCilindradas());
    }
}
