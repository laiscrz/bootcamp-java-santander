package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltragemNumerosPrimos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando numeros Primos
        List<Integer> primos = numeros.stream().filter(n -> obterPrimo(n)).collect(Collectors.toList());

        // Exibição dos números primos
        System.out.println("Números Primos: " + primos);
    }

    // Método para verificar se um número é primo
    private static boolean obterPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
