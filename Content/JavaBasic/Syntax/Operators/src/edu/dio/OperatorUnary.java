package edu.dio;

public class OperatorUnary {

    public static void main(String[] args) {
        
        // OPERADORES UNÁRIOS
        // + unário de valor positivo
        // - unário de valor negativo
        // ++ incremento
        // -- decremento
        // ! negação lógica

        int numero = 5;
        
        // Imprimindo o número negativo
        System.out.println("- numero: " + (-numero)); // Imprime: -5
        
        // Incrementando número em 1 e imprimindo (pós-incremento)
        System.out.println("numero++: " + (numero++)); // Imprime: 5
        // Agora numero é 6 após o incremento pós-fixado
        
        // Incrementando número em 1 e imprimindo (pós-incremento)
        System.out.println("numero++ (após incremento): " + numero); // Imprime: 6
        // Agora numero é 6 após o incremento pós-fixado
        
        // Incrementando número em 1 e imprimindo (pré-incremento)
        System.out.println("++numero: " + (++numero)); // Imprime: 7
        // Agora numero é 7 após o incremento pré-fixado
        
        boolean verdadeiro = true;
        
        // Invertendo o valor booleano com negação lógica
        System.out.println("Inverteu verdadeiro: " + !verdadeiro); // Imprime: false
    }
}
