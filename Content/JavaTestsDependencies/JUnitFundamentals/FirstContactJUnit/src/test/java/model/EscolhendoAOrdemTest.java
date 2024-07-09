package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
// import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTest {

    // @Order(1)
    @DisplayName("Teste que valida se o usuário foi criado")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
