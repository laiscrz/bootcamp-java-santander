package edu.dio;

public class OperatorArithmetic {

    public static void main(String[] args) {

        // OPERADORES ARITMÉTICOS
        // + Adição
        // - Subtração
        // * Multiplicação
        // / Divisão
        // % Resto da divisão (módulo)

        // Adição de dois números
        double soma = 10.5 + 15.7;
        // Subtração de dois números
        int subtracao = 113 - 25;
        // Multiplicação de dois números
        int multiplicacao = 20 * 7;
        // Divisão de dois números inteiros
        int divisao = 15 / 3;
        // Módulo de dois números (resto da divisão)
        int modulo = 18 % 3;
        // Expressão combinada com múltiplas operações aritméticas
        double resultado = (10 * 7) + (20 / 4);

        // Imprimindo os resultados das operações
        System.out.println("Soma: " + soma); // Exemplo: 10.5 + 15.7 = 26.2
        System.out.println("Subtração: " + subtracao); // Exemplo: 113 - 25 = 88
        System.out.println("Multiplicação: " + multiplicacao); // Exemplo: 20 * 7 = 140
        System.out.println("Divisão: " + divisao); // Exemplo: 15 / 3 = 5
        System.out.println("Módulo: " + modulo); // Exemplo: 18 % 3 = 0
        System.out.println("Resultado: " + resultado); // Exemplo: (10 * 7) + (20 / 4) = 70 + 5 = 75.0

        // ATENÇÃO
        System.out.println("----------------ATENÇÃO----------------");
        // + (Adição) em String -> concatenação

        // Concatenando Strings
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Nome Completo: " + nomeCompleto); // Exemplo: LINGUAGEMJAVA

        // Qual o resultado das expressões abaixo?
        String concatenacao;

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("Concatenacao 1: " + concatenacao); // Exemplo: 31 (1 + 1 + 1 = 3, então "3" + "1" = "31")

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("Concatenacao 2: " + concatenacao); // Exemplo: 1111 (1 + "1" = "11", "11" + 1 = "111", "111" + 1 = "1111")

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("Concatenacao 3: " + concatenacao); // Exemplo: 1111 (1 + "1" = "11", "11" + 1 = "111", "111" + "1" = "1111")

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("Concatenacao 4: " + concatenacao); // Exemplo: 1111 ("1" + 1 = "11", "11" + 1 = "111", "111" + 1 = "1111")

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("Concatenacao 5: " + concatenacao); // Exemplo: 13 (1 + 1 + 1 = 3, então "1" + 3 = "13")
    }
}
