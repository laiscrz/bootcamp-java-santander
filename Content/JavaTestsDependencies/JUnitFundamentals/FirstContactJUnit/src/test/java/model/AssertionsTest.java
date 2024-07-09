package model;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertionsTest {

    @Test
    void testValidarLacamentos() {
        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };

        int[] segundoLancamento = { -1, 5, 2, 3, 10 };

        // assertArrayEquals
        assertNotEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    void testValidarNull(){
        Pessoa pessoa = null;

        assertNull(pessoa);

        Pessoa pes = new Pessoa("José", LocalDate.now());

        assertNotNull(pes);
    }

    @Test
    void testValidarNumTiposDiferentes(){
        double valor = 5.0;

        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
