package main.java.operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo List<>
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        // Verifica se a lista de tarefas está vazia
        if (!tarefaList.isEmpty()) {
            // Percorre cada tarefa na lista
            for (Tarefa t : tarefaList) {
                // Compara a descrição da tarefa, ignorando maiúsculas e minúsculas
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    // Adiciona a tarefa à lista de remoção
                    tarefasRemover.add(t);
                }
            }
            // Remove todas as tarefas que correspondem à descrição
            tarefaList.removeAll(tarefasRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar livro");
        listaTarefa.adicionarTarefa("Estudar para o vestibular");
        listaTarefa.adicionarTarefa("Fazer exercícios");
        listaTarefa.adicionarTarefa("Terminar o curso Java");
        listaTarefa.adicionarTarefa("Trabalhar");

        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");

        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.obterDescricoesTarefas();

        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");

        // Exibindo o número total de tarefas na lista após tentar remover de uma lista
        // vazia
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
