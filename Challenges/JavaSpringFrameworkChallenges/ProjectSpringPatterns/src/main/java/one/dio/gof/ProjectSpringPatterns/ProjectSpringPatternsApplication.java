package one.dio.gof.ProjectSpringPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author lais
 */
@EnableFeignClients
@SpringBootApplication
public class ProjectSpringPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpringPatternsApplication.class, args);
	}

}
