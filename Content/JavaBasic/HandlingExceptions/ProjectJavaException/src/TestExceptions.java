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
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
    }
}
