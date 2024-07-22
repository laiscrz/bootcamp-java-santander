package br.com.dio.SpringSecurityUsageJwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.dio.SpringSecurityUsageJwt.model.User;
import br.com.dio.SpringSecurityUsageJwt.repository.IUserRepository;

@Service
public class UserService {

    @Autowired
    private IUserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user){
        String pass = user.getPassword();

        // criptografar senha antes de salvar no banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}
