package edu.dio;

public class OperatorTernary {

    public static void main(String[] args) {

        // OPERADOR TERNÁRIO

        int a = 5;
        int b = 6;

        // Exemplo de condicional utilizando estrutura if/else
        
        /*
         * if(a == b)
         *     resultado = "verdadeiro";
         * else
         *     resultado = "falso";
        */

        
        // Mesma condicional usando o operador condicional ternário
        String resultado = (a == b) ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
