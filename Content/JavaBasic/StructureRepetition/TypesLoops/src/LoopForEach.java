public class LoopForEach {

    public static void main(String[] args) {
        // ESTRUTURA DE REPETIÇÃO -> FOREACH

        // Array de exemplo contendo nomes de alunos
        String[] alunos = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Iteração utilizando o foreach
        for (String aluno : alunos) {
            /*
             * Sintaxe do foreach:
             * 
             * for (tipo elemento : colecao) {
             *      // Código a ser executado para cada elemento
             * }
             * 
             * Neste caso, 'aluno' é o elemento atual sendo percorrido no array 'alunos'.
             * A cada iteração, o nome do aluno é exibido no console.
             */
            System.out.println("O nome do Aluno(a) é: " + aluno);
        }
    }
}
