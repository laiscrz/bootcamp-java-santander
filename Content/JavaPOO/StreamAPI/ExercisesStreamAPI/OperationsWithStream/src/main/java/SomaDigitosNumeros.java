package main.java;

import java.util.Arrays;
import java.util.List;

public class SomaDigitosNumeros {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcula a soma dos dígitos de todos os números da lista
        int somaDigitos = numeros.stream()
                .mapToInt(numero -> somaDosDigitos(numero))
                .sum();

        System.out.println("A soma dos dígitos de todos os números é: " + somaDigitos);
    }

    // Método para calcular a soma dos dígitos de um número
    private static int somaDosDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10; // Obtém o último dígito do número
            numero /= 10; // Remove o último dígito do número
        }
        return soma;
    }
}
