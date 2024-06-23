public class AboutMe {
    public static void main(String[] args) {
        // Captura os argumentos passados pela linha de comando
        String nome = args[0]; // Captura o primeiro argumento como nome
        String sobrenome = args[1]; // Captura o segundo argumento como sobrenome
        int idade = Integer.valueOf(args[2]); // Converte o terceiro argumento para int (idade)
        double altura = Double.valueOf(args[3]); // Converte o quarto argumento para double (altura)

        // Imprime as informações pessoais baseadas nos argumentos recebidos
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");

        // Exemplo de execução no terminal:
        // Se o programa estiver compilado e localizado na pasta "bin":
        // Comando no terminal/cmd: java AboutMe João Silva 25 175.5
        // Isso atribuirá "João" a nome, "Silva" a sobrenome, 25 a idade e 175.5 a altura.
        // Os valores são acessados pela posição no array args, começando em 0.
    }
}
