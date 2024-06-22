package edu.dio;

public class OperatorRelational {

    public static void main(String[] args) {

        // OPERADORES RELACIONAIS
        // == Verifica se dois valores são iguais
        // != Verifica se dois valores são diferentes
        // > Verifica se o valor à esquerda é maior que o valor à direita
        // >= Verifica se o valor à esquerda é maior ou igual ao valor à direita
        // < Verifica se o valor à esquerda é menor que o valor à direita
        // <= Verifica se o valor à esquerda é menor ou igual ao valor à direita

        // Definindo dois números inteiros
        int numero1 = 1;
        int numero2 = 2;

        // Verificação das relações utilizando os operadores relacionais

        // Verifica se numero1 é maior que numero2
        if (numero1 > numero2)
            System.out.print("Numero 1 é maior que numero 2");

        // Verifica se numero1 é menor que numero2
        if (numero1 < numero2)
            System.out.print("Numero 1 é menor que numero 2");

        // Verifica se numero1 é maior ou igual a numero2
        if (numero1 >= numero2)
            System.out.print("Numero 1 é maior ou igual a numero 2");

        // Verifica se numero1 é menor ou igual a numero2
        if (numero1 <= numero2)
            System.out.print("Numero 1 é menor ou igual a numero 2");

        // Verifica se numero1 é diferente de numero2
        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        
        // OPERADORES RELACIONAIS PARA STRINGS E OBJETOS

        // Comparando strings
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); // true (devido a otimização de strings literais)

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); // false (referências diferentes)

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true (mesma referência)

        // Usando equals para comparar conteúdo de strings
        System.out.println(nome1.equals(nome2)); // true (conteúdo é igual)
        System.out.println(nome2.equals(nome3)); // true (conteúdo é igual)
        System.out.println(nome3.equals(nome4)); // true (conteúdo é igual)

        // Comparando objetos Integer

        // Comparação de inteiros menores que 128 (uso de cache)
        Integer num1 = 130;
        Integer num2 = 130;
        System.out.println(num1 == num2); // false (não são a mesma referência)

        // Comparação de inteiros maiores ou iguais a 128 (fora do cache)
        Integer num3 = 130;
        Integer num4 = 130;
        System.out.println(num3.equals(num4)); // true (conteúdo é igual)
    }
}
