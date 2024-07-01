package main.java.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

// Lambda ->  permitem representar interfaces funcionais 
// (interfaces com um único método abstrato) de forma mais concisa e 
// possibilitam escrever código no estilo funcional.
public class ExampleLambda {

    // Atributo
    private List<Pessoa> pessoaList;

    // Construtor
    public ExampleLambda() {
        this.pessoaList = new ArrayList<>();
    }

    // Método para ordenar por altura
    public List<Pessoa> ordenarPorAltura() {
        if (!pessoaList.isEmpty()) {
            // Usando uma expressão lambda para o Comparator
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura())); // Expressão Lambda
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        ExampleLambda exampleLambda = new ExampleLambda();

        // Adicionando algumas pessoas para testar
        exampleLambda.pessoaList.add(new Pessoa("Alice", 1.65));
        exampleLambda.pessoaList.add(new Pessoa("Bob", 1.80));
        exampleLambda.pessoaList.add(new Pessoa("Charlie", 1.75));

        // Ordenar e exibir as pessoas por altura
        List<Pessoa> pessoasOrdenadas = exampleLambda.ordenarPorAltura();
        pessoasOrdenadas.forEach(p -> System.out.println(p.getNome() + ": " + p.getAltura()));
    }
}

class Pessoa {
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }
}
