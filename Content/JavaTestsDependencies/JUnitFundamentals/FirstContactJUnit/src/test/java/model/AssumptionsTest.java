package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class AssumptionsTest {
    
    // Método de teste para validar uma condição específica do usuário
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "userTest")
    @DisabledIfEnvironmentVariable(named = "USER", matches = "userTest")
    void validarAlgoSomenteNoUsuarioTest() {
        // Verifica se a variável de ambiente "USER" não é "root"
        // Se for "root", a suposição falhará e o teste será ignorado
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        
        // Verifica se a soma de 5 + 5 é igual a 10
        // Essa assertiva só será executada se a suposição anterior for verdadeira
        Assertions.assertEquals(10, 5 + 5);
    }
}
