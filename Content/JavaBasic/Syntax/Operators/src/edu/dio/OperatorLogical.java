package edu.dio;

public class OperatorLogical {

    public static void main(String[] args) {

        // OPERADORES LÓGICOS
        // && -> E (AND)
        // || -> OU (OR)

        boolean condicao1 = true;
        boolean condicao2 = false;

        /*
         * Utilizando o operador lógico && (E) para combinar duas condições.
         * Equivalente a: "Se Condicao1 E Condicao2 forem verdadeiras, execute o código."
         */
        if (condicao1 && condicao2) {
            System.out.println("Os dois valores precisam ser verdadeiros");
        }

        /*
         * Utilizando o operador lógico || (OU) para combinar duas condições.
         * Equivalente a: "Se Condicao1 OU Condicao2 for verdadeira, execute o código."
         */
        if (condicao1 || condicao2) {
            System.out.println("Um dos valores precisa ser verdadeiro");
        }

        // COMPARAÇÕES LÓGICAS MAIS COMPLEXAS

        int numero1 = 1;
        int numero2 = 1;

        /*
         * Exemplo de comparação usando & (AND) bit a bit.
         * Atenção: O operador & (AND) bit a bit executa ambas as expressões, independentemente do resultado da primeira.
         */
        if (numero1 == 2 & numero2++ == 2) {
            System.out.println("Ambas as condições são verdadeiras");
        }

        System.out.println("O numero 1 agora é " + numero1); // Imprime "O numero 1 agora é 1"
        System.out.println("O numero 2 agora é " + numero2); // Imprime "O numero 2 agora é 2"

        /*
         * Vamos mudar a linha 35 do código acima para utilizar && (AND) lógico.
         * O operador && (AND) lógico curto-circuita a execução se a primeira condição for falsa,
         * evitando a execução desnecessária da segunda condição.
         */
        if (numero1 == 2 && numero2++ == 2) {
            System.out.println("Ambas as condições são verdadeiras");
        }

    }
}
