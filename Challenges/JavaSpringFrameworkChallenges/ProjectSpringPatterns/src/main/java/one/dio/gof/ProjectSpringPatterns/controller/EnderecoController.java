package one.dio.gof.ProjectSpringPatterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.dio.gof.ProjectSpringPatterns.model.Endereco;
import one.dio.gof.ProjectSpringPatterns.service.EnderecoService;

/**
 * Esse {@link RestController} fornece endpoints para buscar endereços.
 * 
 * @author lais
 */
@RestController
@RequestMapping("enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> buscarEnderecoPorCep(@PathVariable String cep) {
        Endereco endereco = enderecoService.buscarEnderecoPorCep(cep);
        if (endereco == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(endereco);
    }
}
