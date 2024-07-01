package main.java.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um
 * resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros
 * valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números
        // Function<Integer -> ENTRADA, Integer -> SAIDA>
        Function<Integer, Integer> dobrarNumero = numero -> numero * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra
        // lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrarNumero)
                .toList();

        // Imprimir a lista de números originais
        System.out.println("---------- Números Originais ----------");
        numeros.forEach(System.out::println);

        // Imprimir a lista de números dobrados
        System.out.println("---------- Números Dobrados ----------");
        numerosDobrados.forEach(System.out::println);

        // Usar uma função anônima para triplicar todos os números
        List<Integer> numerosTriplicados = numeros.stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer n) {
                        return n * 3;
                    }
                })
                .toList();

        // Imprimir a lista de números triplicados
        System.out.println("---------- Números Triplicados ----------");
        numerosTriplicados.forEach(System.out::println);

        // Usar uma expressão lambda para quintuplicar todos os números
        List<Integer> numerosQuintuplicados = numeros.stream()
                .map(n -> n * 5)
                .toList();

        // Imprimir a lista de números quintuplicados
        System.out.println("---------- Números Quintuplicados ----------");
        numerosQuintuplicados.forEach(System.out::println);
    }
}
