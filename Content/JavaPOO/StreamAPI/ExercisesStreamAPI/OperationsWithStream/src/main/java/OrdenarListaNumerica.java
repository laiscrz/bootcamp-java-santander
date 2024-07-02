package main.java;

import java.util.Arrays;
import java.util.List;

public class OrdenarListaNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando Stream API para ordenar em ordem crescente
        numeros.stream().sorted().forEach(System.out::println);
    }
}
