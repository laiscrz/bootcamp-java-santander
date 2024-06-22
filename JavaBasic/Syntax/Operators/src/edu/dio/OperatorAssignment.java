package edu.dio;

import java.util.Date;

public class OperatorAssignment {

    public static void main(String[] args) {

        // OPERADOR DE ATRIBUIÇÃO
        // = atribui valores

        // Atribui a string "GLEYSON" à variável nome
        String nome = "GLEYSON";

        // Atribui o valor inteiro 22 à variável idade
        int idade = 22;

        // Atribui o valor decimal 68.5 à variável peso
        double peso = 68.5;

        // Atribui o caractere 'M' à variável sexo
        char sexo = 'M';

        // Atribui o valor booleano false à variável doadorOrgao
        boolean doadorOrgao = false;
        
        // Atribui a data atual à variável dataNascimento
        Date dataNascimento = new Date();


        // Imprime o valor da variável nome
        System.out.println("Nome: " + nome);

        // Imprime o valor da variável idade
        System.out.println("Idade: " + idade);

        // Imprime o valor da variável peso
        System.out.println("Peso: " + peso);

        // Imprime o valor da variável sexo
        System.out.println("Sexo: " + sexo);

        // Imprime o valor da variável doadorOrgao
        System.out.println("Doador de Órgão: " + doadorOrgao);

        // Imprime o valor da variável dataNascimento
        System.out.println("Data de Nascimento: " + dataNascimento);

    }
}
