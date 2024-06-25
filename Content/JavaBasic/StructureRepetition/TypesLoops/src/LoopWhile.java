import java.util.concurrent.ThreadLocalRandom;

public class LoopWhile {
    public static void main(String[] args) {
        // ESTRUTURA DE REPETIÇÃO -> WHILE

        /**
         * while (condição) {
         * // bloco de código a ser repetido
         * // comando que será executado até que a expressão de validação torne-se falsa
         * }
        */

        // Inicializa a mesada de Joãozinho como R$ 50.0
        double mesada = 50.0;

        // Enquanto a mesada for maior que 0, o loop continua
        while (mesada > 0) {
            // Gera um valor aleatório para o doce utilizando o método valorAleatorio()
            Double valorDoce = valorAleatorio();

            // Se o valor do doce gerado aleatoriamente for maior que a mesada restante,
            // ajusta o valorDoce para ser igual à mesada restante
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            // Imprime uma mensagem indicando que um doce no valor específico foi adicionado
            // no carrinho
            System.out.println("Doce no valor de R$" + valorDoce + " adicionado ao carrinho");

            // Subtrai o valor do doce da mesada atual
            mesada -= valorDoce;
        }

        // Quando a mesada se torna 0 ou negativa, o loop termina e imprime a mensagem
        // final
        System.out.println("Mesada restante: R$" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    // Método que gera um valor aleatório entre 2 (inclusive) e 8 (exclusivo)
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
