// 1. Abra o terminal e navegue até o diretório onde está localizado o arquivo compilado.
// 2. Localize o arquivo ScannerAboutMe.class dentro da pasta bin.
// 3. Execute o comando "java ScannerAboutMe" para iniciar o programa.
// 4. Siga as instruções para inserir os dados solicitados (nome, sobrenome, idade e altura).
// 5. Após inserir os dados, pressione Enter para confirmar cada entrada.
// 6. Os dados inseridos serão exibidos no terminal após a conclusão do programa.

import java.util.Locale;
import java.util.Scanner;

public class ScannerAboutMe {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        scanner.close();

    }
}
