package model;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// @BeforeAll & @AfterAll -> Executa uma vez antes de todos os testes e uma vez após todos os testes
// @BeforeEach & @AfterEach -> Executa antes e depois de cada teste individual
public class ConsultarDadosTest {

    // Método executado uma vez antes de todos os testes
    @BeforeAll 
    static void testConfigConexao(){
        Conexao.iniciarConexao();
        System.out.println("Conexão feita com sucesso!");
    }

    // Método executado antes de cada teste individual
    @BeforeEach 
    void testInsert(){
        Conexao.insert(new Pessoa("Mariano", LocalDate.of(2014, 05, 29)));
    }

    // Método de teste para validar dados
    @Test
    void testValidarDados(){
        Assertions.assertTrue(true);
    }

    // Método executado após cada teste individual
    @AfterEach
    void testDelete(){
        Conexao.delete(new Pessoa("Mariano", LocalDate.of(2014, 05, 29)));
    }

    // Método executado uma vez após todos os testes
    @AfterAll
    static void testFecharConexao(){
        Conexao.fecharConexao();
        System.out.println("Conexão fechada.");
    }
}
