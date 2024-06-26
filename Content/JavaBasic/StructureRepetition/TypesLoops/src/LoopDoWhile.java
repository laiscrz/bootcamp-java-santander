import java.util.Random;

public class LoopDoWhile {

    public static void main(String[] args) {
    // ESTRUTURA DE REPETIÇÃO -> DO WHILE

        /**
         * do {
         *      // bloco de código a ser repetido até que a expressão de validação se torne
         * falsa
         * }
         * while (condição);
        */

        System.out.println("Discando..."); // Mensagem inicial mostrando que está discando

        // Loop do-while que toca o telefone até que alguém atenda
        do {
            System.out.println("Telefone tocando"); // Mensagem indicando que o telefone está tocando

        } while (tocando()); // Continua tocando enquanto o método tocando() retornar true

        System.out.println("Alô !!!"); // Mensagem final após alguém atender o telefone
    }

    // Método que simula a probabilidade de alguém atender o telefone
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1; // Gera aleatoriamente se alguém atende (probabilidade de 1/3)
        System.out.println("Atendeu? " + atendeu); // Imprime se alguém atendeu ou não
        return !atendeu; // Retorna true se ninguém atendeu, o que mantém o loop do-while
    }
}
