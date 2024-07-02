package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverImpares {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        // Criando uma nova lista e removendo números ímpares
        // Usando stream para filtrar os números pares e coletar em uma nova lista
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(numerosPares);  // Imprimindo a nova lista de números pares

        // Modificando a lista original para remover números ímpares
        // Usando o método removeIf para remover todos os elementos que são ímpares
        numeros.removeIf(n -> n % 2 != 0);
        System.out.println(numeros);  // Imprimindo a lista original após a remoção dos números ímpares
    }
}
