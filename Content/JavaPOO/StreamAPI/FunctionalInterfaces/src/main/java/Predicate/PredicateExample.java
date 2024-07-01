package main.java.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor
 * booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma
 * condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5; // lambda

        // imprimir cada palavra que passou no filtro
        System.out.println("Palavras com mais de 5 caracteres:");
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        // Criar um Predicate usando uma classe anônima para verificar se a palavra tem
        // igual ou mais de 4 caracteres
        Predicate<String> maisDeQuatroCaracteres = new Predicate<String>() {
            @Override
            public boolean test(String palavra) {
                return palavra.length() >= 4;
            }
        };

        // Imprimir palavras com igual ou mais de 4 caracteres usando classe anônima
        System.out.println("Palavras com igual ou mais de 4 caracteres:");
        palavras.stream()
                .filter(maisDeQuatroCaracteres)
                .forEach(System.out::println);

        // Imprimir palavras com igual ou mais de 2 caracteres usando lambda diretamente
        // no filter
        System.out.println("Palavras com igual ou mais de 2 caracteres:");
        palavras.stream()
                .filter(p -> p.length() >= 2)
                .forEach(System.out::println);
    }
}