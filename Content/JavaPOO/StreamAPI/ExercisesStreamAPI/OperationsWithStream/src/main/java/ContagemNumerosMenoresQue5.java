package main.java;

import java.util.Arrays;
import java.util.List;

public class ContagemNumerosMenoresQue5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando os números menores que 5 e coletando-os em uma nova lista
        List<Integer> numerosMenoresQue5 = numeros.stream()
                .filter(n -> n < 5)
                .toList(); // usando .toList() para coletar em uma lista

        System.out.println("Números menores que 5 : " + numerosMenoresQue5);
    }
}
