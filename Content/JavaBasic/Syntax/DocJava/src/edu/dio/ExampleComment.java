package edu.dio;

public class ExampleComment {

    public static void main(String[] args) {

        // Comentário de apenas uma linha
        // Este é um comentário simples que explica uma única linha de código.
        System.out.println("Hello, World!");

        /**
         * Comentário com várias linhas
         * Este tipo de comentário é usado para explicar blocos de código ou fornecer
         * mais detalhes sobre o que o código faz. Pode ser usado para descrever
         * a lógica do programa, as variáveis usadas, ou qualquer outro aspecto
         * que necessite de uma explicação mais longa.
        */
        int x = 10; // Inicializa a variável x com o valor 10
        int y = 20; // Inicializa a variável y com o valor 20

        /*
         * Este bloco de código abaixo realiza a soma das variáveis x e y,
         * e armazena o resultado na variável z.
        */
        int z = x + y; // z agora tem o valor 30

        // Imprime o resultado da soma
        System.out.println("O valor de z é: " + z);
    }
}
