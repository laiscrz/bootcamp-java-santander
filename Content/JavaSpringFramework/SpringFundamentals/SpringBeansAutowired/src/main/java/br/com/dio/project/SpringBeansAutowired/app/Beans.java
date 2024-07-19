package br.com.dio.project.SpringBeansAutowired.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    // Beans -> não tenho acesso ao codigo fonte
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
