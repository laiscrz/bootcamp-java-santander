package main.java.Supplier;

import java.util.List;
import java.util.function.Supplier;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um
 * resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado
 * tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();
        // .collect(Collectors.toList());

        // Imprimir as saudações geradas
        System.out.println("---------- Com Lambda ----------");
        listaSaudacoes.forEach(s -> System.out.println(s));

        System.out.println("---------- Com Referência a Métodos ----------");
        listaSaudacoes.forEach(System.out::println);

        System.out.println("--------------------------------------");
        // Usar o Supplier com classe anônima para fornecer uma saudação personalizada
        Supplier<String> saudacaoAnonima = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        };

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> saudacoesComClasseAnonima = Stream.generate(saudacaoAnonima)
                .limit(5)
                .toList();

        // Usar o Supplier com expressão lambda simples para fornecer uma saudação
        // personalizada
        Supplier<String> saudacaoSimples = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> saudacoesComLambdaSimples = Stream.generate(saudacaoSimples)
                .limit(5)
                .toList();

        // Imprimir as saudações geradas com Classe Anônima
        System.out.println("---------- Com Classe Anônima ----------");
        saudacoesComClasseAnonima.forEach(System.out::println);

        // Imprimir as saudações geradas com Lambda Simples
        System.out.println("---------- Com Lambda Simples ----------");
        saudacoesComLambdaSimples.forEach(System.out::println);
    }
}
