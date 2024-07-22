package me.dio.ProjectSantanderAPI.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.ProjectSantanderAPI.domain.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}