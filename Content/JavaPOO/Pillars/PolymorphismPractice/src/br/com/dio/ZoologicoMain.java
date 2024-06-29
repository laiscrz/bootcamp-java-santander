package br.com.dio;

public class ZoologicoMain {

    public static void main(String[] args) {
        ZoologicoMain zoo = new ZoologicoMain();

        // Demonstrando polimorfismo
        zoo.ouvirSomAnimal(new Cachorro());
        zoo.ouvirSomAnimal(new Gato());

    }

    // Método que aceita Animal e chama emitirSom para demonstrar polimorfismo
    public void ouvirSomAnimal(Animal animal) {
        animal.emitirSom();
    }
}
