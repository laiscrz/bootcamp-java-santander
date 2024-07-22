package one.dio.gof.ProjectSpringPatterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.dio.gof.ProjectSpringPatterns.model.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
