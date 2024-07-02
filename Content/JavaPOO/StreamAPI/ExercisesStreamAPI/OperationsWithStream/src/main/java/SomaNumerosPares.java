package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SomaNumerosPares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra apenas números pares
                .mapToInt(Integer::intValue) // Converte para int
                .sum(); // Soma os valores

        System.out.println("A soma dos números pares é: " + somaPares);

    }
}
