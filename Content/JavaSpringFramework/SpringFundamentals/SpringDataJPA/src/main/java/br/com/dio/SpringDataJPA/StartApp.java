package br.com.dio.SpringDataJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.dio.SpringDataJPA.model.User;
import br.com.dio.SpringDataJPA.repository.IUserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private IUserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("GLEYSON");
        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("Maria");
        user.setUsername("mari_02");
        user.setPassword("1234");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
