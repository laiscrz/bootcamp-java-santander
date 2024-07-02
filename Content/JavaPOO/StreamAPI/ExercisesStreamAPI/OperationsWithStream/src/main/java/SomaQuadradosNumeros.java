package main.java;

import java.util.Arrays;
import java.util.List;

public class SomaQuadradosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcula a soma dos quadrados dos números da lista
        int somaQuadrados = numeros.stream()
                .mapToInt(numero -> numero * numero) // Calcula o quadrado de cada número
                .sum(); // Soma os quadrados

        System.out.println("A soma dos quadrados dos números é: " + somaQuadrados);

    }
}
