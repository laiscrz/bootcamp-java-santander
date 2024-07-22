package one.dio.gof.ProjectSpringPatterns.service;

import one.dio.gof.ProjectSpringPatterns.model.Endereco;

public interface EnderecoService {

   Iterable<Endereco> buscarTodosEnderecos();

   Endereco buscarEnderecoPorCep(String cep);
}
