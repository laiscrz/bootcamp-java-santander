package main.java.imperativeDeclarativeProgramming;

import java.util.ArrayList;
import java.util.List;

// PROGRAMAÇÃO IMPERATIVA ->  paradigma em que o código descreve passo a passo como alcançar um resultado.
public class ExampleImperative {

    // Método para calcular a soma dos elementos de uma lista de números de maneira imperativa
    public int calcularSoma(List<Integer> numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma;
    }

    // Método para verificar se um número é primo de maneira imperativa
    public boolean verificarPrimo(int numero) {
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

    // Método principal para testar a classe
    public static void main(String[] args) {
        ExampleImperative imperative = new ExampleImperative();

        // Exemplo de uso com ArrayList de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(11);

        // Calcular a soma dos números na lista de maneira imperativa
        int soma = imperative.calcularSoma(numeros);
        System.out.println("Soma dos números na lista: " + soma);

        // Verificar se um número é primo de maneira imperativa
        int numero = 7;
        boolean ehPrimo = imperative.verificarPrimo(numero);
        System.out.println("O número " + numero + " é primo? " + (ehPrimo ? "Sim" : "Não"));
    }
}
