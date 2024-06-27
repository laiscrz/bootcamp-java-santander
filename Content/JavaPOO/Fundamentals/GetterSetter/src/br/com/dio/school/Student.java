package br.com.dio.school;

public class Student {

    // atributos
    private String nome;
    private int idade;

    // new
    private String genero;

    // GET -> obter o valor atual do atributo
    // SET -> definir ou modificar o valor de um atributo em um objeto

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
