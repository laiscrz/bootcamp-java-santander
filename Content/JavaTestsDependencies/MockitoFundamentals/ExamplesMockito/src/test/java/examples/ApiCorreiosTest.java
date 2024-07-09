package examples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Teste da classe {@link ApiCorreios} onde é apresentado os matchers com maior
 * detalhes
 */
@ExtendWith(MockitoExtension.class)
public class ApiCorreiosTest {
    @Mock
    private ApiCorreios apiCorreios;

    @Test
    void retornaObjetoQuandoEspecificoValorEhPassado() {
        when(apiCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(null);

        DadosLocalizacao dadosLocalizacao = apiCorreios.buscaDadosComBaseNoCep("161761");

        assertNull(dadosLocalizacao);
    }

    @Test
    void retornaObjetoQuandoEspecificoValorEhPassado2() {
        when(apiCorreios.buscaDadosComBaseNoCep("78787878"))
                .thenReturn(new DadosLocalizacao("AM", "Manaus", "Rua Grajaúna", "casa", "Lago Azul"));

        DadosLocalizacao dadosLocalizacao = apiCorreios.buscaDadosComBaseNoCep("78787878");

        assertEquals("AM", dadosLocalizacao.getUf());
    }
}
