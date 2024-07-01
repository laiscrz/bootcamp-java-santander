package main.java.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um
 * resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar
 * números ou combinar objetos.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somarLambda = (a, b) -> a + b;

        // Usar o BinaryOperator para somar todos os números sem métodos de referência
        int resultadoSomaLambda = numeros.stream()
                .reduce(0, somarLambda);

        // Usar o BinaryOperator com método de referência para somar todos os números no
        // Stream
        int resultadoSomaReferencia = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir os resultados
        System.out.println("A soma dos números usando lambda é: " + resultadoSomaLambda);
        System.out.println("A soma dos números usando método de referência é: " + resultadoSomaReferencia);

        // Usar o BinaryOperator com uma classe anônima para somar todos os números no
        // Stream
        int resultadoSoma = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer n1, Integer n2) {
                        return n1 + n2;
                    }
                });

        // Imprimir o resultado usando a classe anônima
        System.out.println("A soma dos números usando uma classe anônima é: " + resultadoSoma);

    }
}
