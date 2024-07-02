package main.java;

import java.util.Arrays;
import java.util.List;

public class ProdutoNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcula o produto de todos os números da lista
        long calcProduto = numeros.stream().reduce(1, (a, b) -> a * b);

        System.out.println("O produto de todos os números é: " + calcProduto);
    }
}
