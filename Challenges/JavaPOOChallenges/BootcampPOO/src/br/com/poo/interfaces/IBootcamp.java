package br.com.poo.interfaces;

import java.util.Set;

import br.com.poo.model.Conteudo;
import br.com.poo.model.Dev;

public interface IBootcamp {
    
    void adicionarDev(Dev dev);

    void removerDev(Dev dev);

    Set<Dev> listarDevsInscritos();

    void adicionarConteudo(Conteudo conteudo);

    void removerConteudo(Conteudo conteudo);

    Set<Conteudo> listarConteudos();

}
