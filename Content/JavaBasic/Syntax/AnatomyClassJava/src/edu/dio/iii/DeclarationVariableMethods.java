package edu.dio.iii;

public class DeclarationVariableMethods {

    public static void main(String[] args) {

        // Declaração de Var

        String meuPais = "Brasil";

        int anoFabricacao = 2024;

        boolean verdadeira = false; // true / false

        anoFabricacao = 2022;

        System.out.println(meuPais);
        System.out.println(anoFabricacao);
        System.out.println(verdadeira);

        // Declaração de Metodos
        String nome = "Lais";

        String sobrenome = "Silva";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Resultado: " + primeiroNome.concat(" ").concat(segundoNome);
        
    }
}
