package one.dio.gof.ProjectSpringPatterns.service;

import one.dio.gof.ProjectSpringPatterns.model.Endereco;

public interface EnderecoService {

   Endereco buscarEnderecoPorCep(String cep);
}
