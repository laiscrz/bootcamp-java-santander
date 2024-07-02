package main.java;

import java.util.Arrays;
import java.util.List;

public class MediaNumerosMaioresQue5 {

    public static void main(String[] args) {
        // Criando uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando os números maiores que 5 e coletando-os em uma nova lista
        List<Integer> numerosMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .toList(); // usando .toList() para coletar em uma lista

        // Verificando se a lista de números maiores que 5 não está vazia
        if (!numerosMaioresQue5.isEmpty()) {
            // Calculando a média dos números maiores que 5
            double media = numerosMaioresQue5.stream()
                    .mapToDouble(Integer::doubleValue) // Convertendo para double
                    .average() // Calculando a média
                    .orElse(0.0); // Valor padrão se a lista estiver vazia

            // Imprimindo a média calculada
            System.out.println("A média dos números maiores que 5 é: " + media);
        } else {
            // Caso não haja números maiores que 5 na lista original
            System.out.println("Não há números maiores que 5 na lista.");
        }

    }
}
