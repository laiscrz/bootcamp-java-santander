package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
// import static org.mockito.Mockito.anyInt;
// import static org.mockito.Mockito.when;

/**
 * Teste da classe {@Link GeradorNumeros} exemplificando testes de métodos estáticos
 */
@ExtendWith(MockitoExtension.class)
public class GeradorNumerosTest {
  @Test
    void validaGeracaoListaDeNumeros() {
        MockedStatic<GeradorNumeros> gerador = Mockito.mockStatic(GeradorNumeros.class);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        gerador.when(() -> GeradorNumeros.geraNumerosAleatorios(anyInt()))
                .thenReturn(integers);

        Assertions.assertEquals(integers, GeradorNumeros.geraNumerosAleatorios(8));
    }

    @Test
    void validaGeracaoListaDeNumerosSemInformarTamanho() {

        MockedStatic<GeradorNumeros> gerador = Mockito.mockStatic(GeradorNumeros.class);

        List<Integer> integers = List.of(10, 9, 8, 6);

        gerador.when(GeradorNumeros::geraNumerosAleatorios).thenReturn(integers);

        Assertions.assertEquals(integers, GeradorNumeros.geraNumerosAleatorios());
    }
}
