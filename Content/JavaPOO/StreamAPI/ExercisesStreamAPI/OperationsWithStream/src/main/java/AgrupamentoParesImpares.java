package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupamentoParesImpares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupamento dos números em pares e ímpares
        Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Listas de pares e ímpares
        List<Integer> pares = numerosAgrupados.get(true);
        List<Integer> impares = numerosAgrupados.get(false);

        // Exibição dos resultados
        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
    }
}
