package br.com.dio.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dio.SpringDataJPA.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

}
