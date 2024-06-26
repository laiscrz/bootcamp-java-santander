import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TestExceptions {

    public static void main(String[] args) {
        // Tratamento de Exceções
        /**
         * sintaxe:
         * try {
         *     // Código onde uma exceção pode ocorrer
         * } catch (TipoDeExcecao1 nomeDaExcecao1) {
         *     // Tratamento da exceção do TipoDeExcecao1
         * } catch (TipoDeExcecao2 nomeDaExcecao2) {
         *     // Tratamento da exceção do TipoDeExcecao2
         * } finally {
         *     // Código opcional a ser executado sempre, independentemente de ocorrer exceção ou não
         * }
        */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Tipo de dado inválido. Por favor, insira um valor válido.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close(); // Fechando o scanner no bloco finally para garantir que seja sempre executado
        }
    }
}
