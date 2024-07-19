package br.com.dio.SpringScopePrototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.dio.SpringScopePrototype.app.SistemaMensagem;

@SpringBootApplication
public class SpringScopePrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScopePrototypeApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}
