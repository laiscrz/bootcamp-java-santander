package edu.dio;

public class ScopeClass {

    // Escopo de Classe -> Acessivel em toda classe
    
    int variavelDeInstancia; // Variável de instância
    static int variavelDeClasse; // Variável de classe (estática)

    public static void main(String[] args) {

        ScopeClass exemplo = new ScopeClass();

        // Acessando variáveis de classe e de instância
        exemplo.variavelDeInstancia = 10;
        ScopeClass.variavelDeClasse = 20;

        System.out.println("Variável de Instância: " + exemplo.variavelDeInstancia);
        System.out.println("Variável de Classe: " + ScopeClass.variavelDeClasse);

    }

}
