package one.dio.gof.ProjectSpringPatterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.dio.gof.ProjectSpringPatterns.model.Endereco;

@Repository
public interface IEnderecoRepository extends JpaRepository<Endereco, String>{

}
