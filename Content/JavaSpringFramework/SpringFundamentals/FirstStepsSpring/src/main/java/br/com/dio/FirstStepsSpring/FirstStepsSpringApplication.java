package br.com.dio.FirstStepsSpring;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class FirstStepsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStepsSpringApplication.class, args);

		// Exemplo de código que não está disponível aqui porque estamos utilizando o Spring Boot,
		// que gerencia a inicialização e o ciclo de vida da aplicação automaticamente.
		// Isso inclui a gestão de beans e a injeção de dependências, como exemplificado abaixo:

		// Calculadora calc = new Calculadora();
		// System.out.println("Resultado da Soma: " + calc.somar(5, 21));

	}


}
