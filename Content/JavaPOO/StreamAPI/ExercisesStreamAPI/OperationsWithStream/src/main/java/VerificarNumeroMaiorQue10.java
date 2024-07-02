package main.java;

import java.util.Arrays;
import java.util.List;

public class VerificarNumeroMaiorQue10 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // anyMatch: Verifica se pelo menos um elemento da stream satisfaz a condição.
        boolean contemMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);

        System.out.println("Contém números maiores que 10 ? " + contemMaiorQue10);

    }
}
