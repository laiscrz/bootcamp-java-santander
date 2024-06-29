package main.java.operacoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // atributo
    private Set<Convidado> convidadosSet; // Conjunto que armazena objetos do tipo Convidado

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>(); // Inicialização do conjunto como HashSet
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite)); // Adiciona um novo Convidado ao conjunto
    }

    //obs. não aceita valores duplicados
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        // Verifica se o conjunto não está vazio
        if (!convidadosSet.isEmpty()) {
            // Itera sobre os convidados no conjunto
            for (Convidado c : convidadosSet) {
                // Verifica se encontrou o convidado pelo código de convite
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c; // Marca o convidado para remoção
                    break; // Interrompe o loop ao encontrar o convidado
                }
            }
            convidadosSet.remove(convidadoParaRemover); // Remove o convidado do conjunto
        } else {
            throw new RuntimeException("O conjunto está vazio!"); // Lança exceção se o conjunto estiver vazio
        }
    }

    public int contarConvidados() {
        return convidadosSet.size(); // Retorna o número de convidados no conjunto
    }

    public void exibirConvidados() {
        // Verifica se o conjunto não está vazio
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet); // Exibe os convidados presentes no conjunto
        } else {
            System.out.println("O conjunto está vazio!"); // Exibe mensagem se o conjunto estiver vazio
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibindo o número de convidados no conjunto (deve ser zero inicialmente)
        System.out.println(
                "Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235); // Código duplicado, permitido em Set
        conjuntoConvidados.adicionarConvidado("David", 1236);

        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        // Exibindo o número atualizado de convidados no conjunto
        System.out.println(
                "Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
