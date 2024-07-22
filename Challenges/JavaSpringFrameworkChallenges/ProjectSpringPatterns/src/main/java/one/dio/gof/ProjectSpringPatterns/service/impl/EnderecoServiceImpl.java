package one.dio.gof.ProjectSpringPatterns.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.dio.gof.ProjectSpringPatterns.model.Endereco;
import one.dio.gof.ProjectSpringPatterns.repository.IEnderecoRepository;
import one.dio.gof.ProjectSpringPatterns.service.EnderecoService;
import one.dio.gof.ProjectSpringPatterns.service.ViaCepService;

@Service
public class EnderecoServiceImpl implements EnderecoService{
 @Autowired
    private ViaCepService viaCepService;

    @Autowired
    private IEnderecoRepository enderecoRepository;

    /**
     * Busca o endereço pelo CEP utilizando o cliente Feign.
     * 
     * @param cep O CEP do endereço a ser buscado.
     * @return O endereço correspondente ao CEP.
     */
    public Endereco buscarEnderecoPorCep(String cep) {
        return viaCepService.consultarCep(cep);
    }

    /**
     * Busca todos os endereços armazenados no banco de dados.
     * 
     * @return Uma lista de todos os endereços.
     */
    public Iterable<Endereco> buscarTodosEnderecos() {
        return enderecoRepository.findAll();
    }
}
