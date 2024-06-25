package edu.dio;

public class NamesMethods {

    // BOAS PRÁTICAS DE NOME:
    // - Use camelCase para nomear métodos.
    // - Nomeie métodos com verbos que descrevam a ação que estão realizando.

    // static -> Modificador que indica que um método ou variável pertence à classe em vez de pertencer a instâncias 
    // individuais da classe. Métodos estáticos podem ser chamados diretamente usando o nome da classe, sem a necessidade
    // de criar objetos da classe.

    // Método que calcula a soma de dois números inteiros
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Método que verifica se um número é par
    public static boolean isPar(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Chamando o método calculateSum e imprimindo o resultado
        int result = calculateSum(num1, num2);
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + result);

        int num3 = 25;

        // Chamando o método isEven para verificar se num3 é par
        boolean par = isPar(num3);
        if (par) {
            System.out.println(num3 + " é um número par.");
        } else {
            System.out.println(num3 + " não é um número par.");
        }
    }
}
