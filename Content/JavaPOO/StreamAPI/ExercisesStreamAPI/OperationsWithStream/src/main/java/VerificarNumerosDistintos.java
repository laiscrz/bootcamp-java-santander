package main.java;

import java.util.Arrays;
import java.util.List;

public class VerificarNumerosDistintos {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se há números distintos na lista
        boolean numDistintos = numeros.stream().distinct().count() < numeros.size();

        System.out.println("Existem números distintos na lista? " + numDistintos);
    }
}

