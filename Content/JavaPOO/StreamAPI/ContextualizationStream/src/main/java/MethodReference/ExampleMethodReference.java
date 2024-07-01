package main.java.MethodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleMethodReference {

    // Atributo
    private List<Pessoa> pessoaList;

    // Construtor
    public ExampleMethodReference() {
        this.pessoaList = new ArrayList<>();
    }

    // Método para ordenar por altura usando Comparator e referência de método
    public List<Pessoa> ordenarPorAltura() {
        if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        ExampleMethodReference exampleMethodReference = new ExampleMethodReference();

        // Adicionando algumas pessoas para testar
        exampleMethodReference.pessoaList.add(new Pessoa("Alice", 1.65));
        exampleMethodReference.pessoaList.add(new Pessoa("Bob", 1.80));
        exampleMethodReference.pessoaList.add(new Pessoa("Charlie", 1.75));

        // Ordenar e exibir as pessoas por altura
        List<Pessoa> pessoasOrdenadas = exampleMethodReference.ordenarPorAltura();
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
