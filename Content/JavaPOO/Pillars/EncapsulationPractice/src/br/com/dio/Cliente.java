package br.com.dio;

public class Cliente {
    // Atributos privados -> encapsulamento
    private String nome; // Nome do cliente
    private String email; // E-mail do cliente

    // Construtor da classe Cliente
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Método para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para definir ou atualizar o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o e-mail do cliente
    public String getEmail() {
        return email;
    }

    // Método para definir ou atualizar o e-mail do cliente
    public void setEmail(String email) {
        this.email = email;
    }
}
