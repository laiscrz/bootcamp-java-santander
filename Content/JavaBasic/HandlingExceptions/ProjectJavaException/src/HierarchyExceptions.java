public class HierarchyExceptions {

    public static void main(String[] args) {

        // Hierarquia de Exceptions
        /*
         * Checked -> São exceções que o compilador Java exige que sejam tratadas ou
         * declaradas no código.
         * Derivam da classe Exception (ou suas subclasses diretas).
        */
        /*
         * Unchecked -> São exceções que o compilador Java não obriga a serem tratadas
         * ou declaradas.
         * Derivam da classe RuntimeException (ou suas subclasses diretas).
        */

        // Exemplo de Checked Exception (Exceção Checada)
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); // Tentativa de acessar um índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora do intervalo do array.");
        }

        /**
         * Tentamos acessar arr[5], que está fora do intervalo válido do array arr
         * (índices válidos são de 0 a 2). Isso resultará em uma
         * ArrayIndexOutOfBoundsException. Utilizamos um bloco try-catch para capturar
         * essa exceção específica e exibir uma mensagem apropriada.
         */

        // Exemplo de Unchecked Exception (Exceção Não Checada)
        try {
            int resultado = 10 / 0; // Tentativa de divisão por zero
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero: " + e.getMessage());
        }

        /**
         * int resultado = 10 / 0; tenta dividir 10 por zero, o que causa uma
         * ArithmeticException. Este é um exemplo de exceção não checada, que não requer
         * tratamento explícito, mas é capturada aqui para fornecer feedback ao usuário
         * ou registrar o erro.
        */
    }
}
