import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AccountTerminal {

    public static void main(String[] args) {

        /*
         * Todo: Conhecer e Import Scanner
         * Exibir Mensagens para user
         * Obter pelo scanner os valores digitados pelo usuario
         * Exibir Mensagem final da conta criada
         */

        // Configurando o locale para formatação de moeda
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        // Importando a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibindo mensagem de boas-vindas
        System.out.println("----------------------------------");
        System.out.println(" Seja Bem-vindo(a) ao Bank Java! :)");
        System.out.println("----------------------------------");
        System.out.println("Para criar sua conta, digite os dados solicitados:");
        System.out.println("----------------------------------");

        // Solicitando e capturando os dados da conta
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo inicial: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Formatando o saldo para moeda local
        String saldoFormatado = currencyFormatter.format(saldo);

        // Exibindo mensagem de confirmação
        System.out.println("----------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! :)");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoFormatado
                + " já está disponível para saque.");
        System.out.println("----------------------------------");

        // Fechando scanner
        scanner.close();

    }
}
