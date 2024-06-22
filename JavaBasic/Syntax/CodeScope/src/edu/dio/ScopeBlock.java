package edu.dio;

public class ScopeBlock {

    public void metodoComEscopoDeBloco() {
        // Exemplo de escopo de bloco dentro de um if -> Acessivel dentro do bloco
        if (true) {
            int variavelDeBloco = 10; // Variável de bloco
            System.out.println("Variável de Bloco: " + variavelDeBloco);
        }
        
        // A linha seguinte causaria um erro de compilação porque variavelDeBloco não
        // está acessível fora do bloco if
        // System.out.println(variavelDeBloco);
    }

    public static void main(String[] args) {
        ScopeBlock exemplo = new ScopeBlock();
        exemplo.metodoComEscopoDeBloco();
    }

}
