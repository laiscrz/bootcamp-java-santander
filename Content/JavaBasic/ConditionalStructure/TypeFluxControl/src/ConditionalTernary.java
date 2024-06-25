public class ConditionalTernary {

    public static void main(String[] args) {

        // Cenario 1
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Cenario 2
        int not = 6;
        String result = not >= 7 ? "Aprovado" : not >= 5 && not < 7 ? "Recuperação" : "Reprovado";
        System.out.println(result);
    }
}
