package me.dio.ProjectSantanderAPI.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {
@Bean
        OpenAPI customAPI() {
                return new OpenAPI()
                                .info(new Info().title("Project Spring Santander - API")
                                                .description("API documentação - Desenvolvida durante Bootcamp Santander")
                                                .version("1.0.0")
                                                .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                                .servers(List.of(
                                                new Server().url("https://localhost:8080")
                                                                .description("Servidor Local para desenvolvimento")))
                                .tags(List.of(
                                                new Tag().name("Users").description("Operações relacionadas aos usuários"),
                                                new Tag().name("Criação").description("Operações de criação"),
                                                new Tag().name("Leitura").description("Operações de leitura")
                                                // new Tag().name("Atualização").description("Operações de atualização"),
                                                // new Tag().name("Exclusão").description("Operações de exclusão")
                                                ));
        }
}
