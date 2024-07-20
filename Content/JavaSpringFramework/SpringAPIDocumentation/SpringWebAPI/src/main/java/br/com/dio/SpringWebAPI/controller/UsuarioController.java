package br.com.dio.SpringWebAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.SpringWebAPI.model.Usuario;
import br.com.dio.SpringWebAPI.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/usuarios")
    public void post(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    @PutMapping("/usuarios")
    public void put(@RequestBody Usuario usuario) {
        repository.save(usuario);;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAll() {
        return repository.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);;
    }
}
