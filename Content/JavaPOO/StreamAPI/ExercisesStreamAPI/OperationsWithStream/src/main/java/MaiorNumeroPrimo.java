package main.java;

import java.util.Arrays;
import java.util.List;

public class MaiorNumeroPrimo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontra o maior número primo na lista
        Integer maiorPrimo = numeros.stream()
                .filter(MaiorNumeroPrimo::obterPrimo)
                .max(Integer::compare)
                .orElse(null);

        // Exibe o resultado no console
        if (maiorPrimo != null) {
            System.out.println("O maior número primo na lista é: " + maiorPrimo);
        } else {
            System.out.println("Não há números primos na lista.");
        }
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
