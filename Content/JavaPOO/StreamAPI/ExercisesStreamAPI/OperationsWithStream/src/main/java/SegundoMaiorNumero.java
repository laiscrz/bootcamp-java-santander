package main.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SegundoMaiorNumero {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrando o segundo maior número usando a Stream API
        Integer segundoMaior = numeros.stream()
                .distinct() // Garante que não haja duplicatas
                .sorted(Comparator.reverseOrder()) // Ordena em ordem descendente
                .skip(1) // Pula o primeiro elemento (maior número)
                .findFirst() // Retorna o primeiro elemento da stream (segundo maior número)
                .orElseThrow(() -> new IllegalArgumentException("Lista não contém pelo menos dois elementos"));

        System.out.println("O segundo maior número da lista é: " + segundoMaior);
    }
}
