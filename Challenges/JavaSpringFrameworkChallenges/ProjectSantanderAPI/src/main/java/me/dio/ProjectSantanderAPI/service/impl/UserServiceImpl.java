package me.dio.ProjectSantanderAPI.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.ProjectSantanderAPI.domain.model.User;
import me.dio.ProjectSantanderAPI.domain.repository.IUserRepository;
import me.dio.ProjectSantanderAPI.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }

}
