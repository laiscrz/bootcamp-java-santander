package model;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void testValidarIdade(){
        Pessoa pessoa = new Pessoa("Maria", LocalDate.of(2005, 05, 20));
        Assertions.assertEquals(19, pessoa.getIdade());
    }

    @Test
    void testMaiorIdade(){
        Pessoa pessoa = new Pessoa("Maria", LocalDate.of(2005, 05, 20));
        Assertions.assertTrue(pessoa.MaiorIdade());

        Pessoa pessoaDois = new Pessoa("José", LocalDate.of(2010, 04, 10));
        Assertions.assertFalse(pessoaDois.MaiorIdade());
    }
}
