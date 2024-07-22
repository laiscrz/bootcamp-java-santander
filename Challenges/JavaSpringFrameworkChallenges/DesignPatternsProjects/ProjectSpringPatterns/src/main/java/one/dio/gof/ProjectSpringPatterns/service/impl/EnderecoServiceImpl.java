package one.dio.gof.ProjectSpringPatterns.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.dio.gof.ProjectSpringPatterns.model.Endereco;
import one.dio.gof.ProjectSpringPatterns.service.EnderecoService;
import one.dio.gof.ProjectSpringPatterns.service.ViaCepService;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    @Autowired
    private ViaCepService viaCepService;

    /**
     * Busca o endereço pelo CEP utilizando o cliente Feign.
     * 
     * @param cep O CEP do endereço a ser buscado.
     * @return O endereço correspondente ao CEP.
     */
    public Endereco buscarEnderecoPorCep(String cep) {
        return viaCepService.consultarCep(cep);
    }

}
