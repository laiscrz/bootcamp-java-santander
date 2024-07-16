package br.com.dio.project.SpringBeansAutowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// import com.google.gson.Gson;

import br.com.dio.SpringBeansAutowired.app.ConversorJson;
import br.com.dio.SpringBeansAutowired.app.ViaCepResponse;

@SpringBootApplication
public class SpringBeansAutowiredApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansAutowiredApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

	// @Bean
	// public Gson gson(){
	// 	return new Gson();
	// }
}
