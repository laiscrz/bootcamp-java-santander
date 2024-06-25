public class ExampleBreakContinue {

    public static void main(String[] args) {
        // Uso do break
        System.out.println("-----------Uso Break-----------");
        for (int numero = 0; numero <= 5; numero++) {
            if (numero == 3)
                break; // Interrompe o loop quando numero é igual a 3

            System.out.println(numero); // Imprime o valor atual de numero
        }

        // Uso do continue
        System.out.println("-----------Uso Continue-----------");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue; // Pula para a próxima iteração quando numero é igual a 3

            System.out.println(numero); // Imprime o valor atual de numero, exceto quando numero é igual a 3
        }
    }

    // Observem que sempre o break e continue ``, está condicionado a um critério de
    // negócio.

}
