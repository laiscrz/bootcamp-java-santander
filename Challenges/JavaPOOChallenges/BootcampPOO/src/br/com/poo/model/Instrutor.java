package br.com.poo.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Instrutor extends Usuario {
    private Set<Conteudo> conteudosMinistrados = new LinkedHashSet<>();

    public Instrutor(String nome) {
        super(nome);
    }

    public Set<Conteudo> getConteudosMinistrados() {
        return conteudosMinistrados;
    }

    public void adicionarConteudoMinistrado(Conteudo conteudo) {
        conteudosMinistrados.add(conteudo);
    }

    public void removerConteudoMinistrado(Conteudo conteudo) {
        conteudosMinistrados.remove(conteudo);
    }
}
