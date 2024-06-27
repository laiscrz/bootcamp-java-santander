package br.com.dio.school;

public class School {

    public static void main(String[] args) {
        Student studentUm = new Student();

        studentUm.nome = "Maria";
        studentUm.idade = 8;

        System.out.println("----------Aluno 1----------");
        System.out.println("Nome: " + studentUm.nome);
        System.out.println("Idade: " + studentUm.idade);

    }
}
