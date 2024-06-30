package main.java.imperativeDeclarativeProgramming;

import java.util.ArrayList;
import java.util.List;

// PROGRAMAÇÃO DECLATIVA -> A programação declarativa, por outro lado, se concentra no que deve ser alcançado, 
// em vez de como alcançá-lo. Neste paradigma, o programador expressa lógica e regras sem se preocupar com os passos 
// individuais de implementação.
public class ExampleDeclarative {

    // Método para calcular a soma dos elementos de uma lista de números de maneira
    // declarativa
    public int calcularSoma(List<Integer> numeros) {
        return numeros.stream()
                .reduce(0, Integer::sum); // Utiliza o método reduce para somar os elementos
    }

    // Método para verificar se um número é primo de maneira declarativa
    public boolean verificarPrimo(int numero) {
        return numero > 1 &&
                !java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                        .anyMatch(i -> numero % i == 0); // Utiliza IntStream e anyMatch
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        ExampleDeclarative declarative = new ExampleDeclarative();

        // Exemplo de uso com ArrayList de números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(11);

        // Calcular a soma dos números na lista de maneira declarativa
        int soma = declarative.calcularSoma(numeros);
        System.out.println("Soma dos números na lista: " + soma);

        // Verificar se um número é primo de maneira declarativa
        int numero = 7;
        boolean ehPrimo = declarative.verificarPrimo(numero);
        System.out.println("O número " + numero + " é primo? " + (ehPrimo ? "Sim" : "Não"));
    }
}
