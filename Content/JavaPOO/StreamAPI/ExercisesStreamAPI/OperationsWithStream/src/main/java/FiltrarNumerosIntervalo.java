package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNumerosIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Define o intervalo desejado
        int min = 5;
        int max = 10;

        // Filtra os números no intervalo específico
        List<Integer> numerosFiltrados = numeros.stream()
                .filter(num -> num >= min && num <= max)
                .collect(Collectors.toList());

        // Exibe o resultado no console
        System.out.println("Números no intervalo [" + min + ", " + max + "]: " + numerosFiltrados);
    }
}
