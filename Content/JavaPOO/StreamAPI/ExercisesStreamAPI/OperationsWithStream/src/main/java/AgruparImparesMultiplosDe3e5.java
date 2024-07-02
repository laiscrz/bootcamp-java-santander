package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparImparesMultiplosDe3e5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Agrupamento de números ímpares que são múltiplos de 3 ou 5
        Map<String, List<Integer>> grupos = numeros.stream()
                .filter(numero -> numero % 2 != 0) // Seleciona apenas números ímpares
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Filtra os múltiplos de 3 ou 5
                .collect(Collectors.groupingBy(numero -> {
                    if (numero % 3 == 0 && numero % 5 == 0) {
                        return "Múltiplo de 3 e 5";
                    } else if (numero % 3 == 0) {
                        return "Múltiplo de 3";
                    } else {
                        return "Múltiplo de 5";
                    }
                }));

        // Imprimir os grupos
        grupos.forEach((tipo, lista) -> {
            System.out.println("Números " + tipo + ": " + lista);
        });
    }
}
