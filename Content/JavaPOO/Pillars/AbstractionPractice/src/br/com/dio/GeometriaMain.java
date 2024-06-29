package br.com.dio;

public class GeometriaMain {

    public static void main(String[] args) {
        // Criando um círculo com raio 5
        Circulo circulo = new Circulo(5);

        // Calculando área e perímetro do círculo
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();

        // Exibindo resultados
        System.out.println("------------Círculo------------");
        System.out.println("Área: " + areaCirculo);
        System.out.println("Perímetro: " + perimetroCirculo);

        System.out.println("---------------------------------");

        // Criando um retângulo com lados 3 e 4
        Retangulo retangulo = new Retangulo(3, 4);

        // Calculando área e perímetro do retângulo
        double areaRetangulo = retangulo.calcularArea();
        double perimetroRetangulo = retangulo.calcularPerimetro();

        // Exibindo resultados
        System.out.println("------------Retângulo------------");
        System.out.println("Área: " + areaRetangulo);
        System.out.println("Perímetro: " + perimetroRetangulo);

    }
}
