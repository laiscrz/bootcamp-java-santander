package edu.dio;

public class ScopeMethods {

    public void metodoComEscopoLocal() {
        // Escopo de Método -> Acessivel pelo metodo
        int variavelLocal = 5; // Variável local
        System.out.println("Variável Local: " + variavelLocal);
    }

    public static void main(String[] args) {
        ScopeMethods exemplo = new ScopeMethods();
        exemplo.metodoComEscopoLocal();
    }
}
