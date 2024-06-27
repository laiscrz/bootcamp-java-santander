package br.com.dio;

public class SistemaCadastro {

    public static void main(String[] args) {

        // com construtor vazio (uso set)
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.setNome("José");
        pessoaUm.setCpf("12156332");
        pessoaUm.setEndereco("Av Treze de Maio, n78");
        // Visualize - Pessoa 1
        System.out.println("-----------Pessoa 1-----------");
        System.out.println("Nome: " + pessoaUm.getNome() +
                "\nCPF: " + pessoaUm.getCpf() +
                "\nEndereço: " + pessoaUm.getEndereco() + "\n");
        
        // usando construtor cheio
        Pessoa pessoaDois = new Pessoa("Maria", "1225515", "Av Paulista, n28");
        // Visualize - Pessoa 2
        System.out.println("-----------Pessoa 2-----------");
        System.out.println("Nome: " + pessoaDois.getNome() +
                "\nCPF: " + pessoaDois.getCpf() +
                "\nEndereço: " + pessoaDois.getEndereco() + "\n");

    }
}
