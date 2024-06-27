package br.com.dio.school;

public class School {

    public static void main(String[] args) {
        Student studentUm = new Student();

        studentUm.setNome("Maria");
        studentUm.setIdade(8);
        studentUm.setGenero("Feminino");

        System.out.println("----------Aluno 1----------");
        System.out.println("Nome: " + studentUm.getNome());
        System.out.println("Idade: " + studentUm.getIdade());
        System.out.println("Genero: " + studentUm.getGenero());
    }
}
