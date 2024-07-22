package me.dio.ProjectSantanderAPI.service;

import me.dio.ProjectSantanderAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
    
}
