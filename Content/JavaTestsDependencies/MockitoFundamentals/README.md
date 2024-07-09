# Teste com Mockito 🎭

Mockito é um framework de código aberto para Java que facilita a criação de objetos simulados (mocks) para testes unitários. Ele permite que você:

- **Simule Comportamentos**: Defina o comportamento de métodos em objetos simulados.
- **Verifique Interações**: Assegure que métodos foram chamados com parâmetros esperados.
- **Teste Isoladamente**: Teste componentes sem depender de suas implementações reais.

## Por que usar Mockito? 🚀

- **Isolamento**: Permite testar componentes de maneira isolada, sem depender de outros componentes ou sistemas externos.
- **Facilidade**: Simplifica a criação de objetos simulados e a definição de comportamentos esperados.
- **Verificação**: Verifica se métodos foram chamados corretamente durante o teste.
- **Integração**: Integra facilmente com frameworks de testes como JUnit.

## Como começar 🛠️

Para começar a usar Mockito, siga os passos abaixo:

1. **Adicionar Dependência**: Certifique-se de que o Mockito está incluído nas dependências do seu projeto. Se estiver usando Maven, adicione a dependência ao seu `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.mockito</groupId>
       <artifactId>mockito-core</artifactId>
       <version>4.0.0</version>
       <scope>test</scope>
   </dependency>
   ```
   Substitua `4.0.0` pela versão mais recente do Mockito.

2. **Criar um Mock**: Use a anotação `@Mock` ou o método `Mockito.mock` para criar um objeto simulado.
   ```java
   @Mock
   private MyService myService;

   MyService myService = Mockito.mock(MyService.class);
   ```

3. **Definir Comportamento**: Use o método `when` para definir o comportamento esperado do mock.
   ```java
   when(myService.someMethod()).thenReturn(someValue);
   ```

4. **Verificar Interações**: Use o método `verify` para verificar se métodos foram chamados corretamente.
   ```java
   verify(myService).someMethod();
   ```

## Exemplo Básico 📘

Aqui está um exemplo básico de teste usando Mockito:

```java
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyServiceTest {

    @Test
    void testSomeMethod() {
        // Criar mock
        MyService myService = Mockito.mock(MyService.class);

        // Definir comportamento
        when(myService.someMethod()).thenReturn("Hello Mockito");

        // Chamar método e verificar resultado
        String result = myService.someMethod();
        assertEquals("Hello Mockito", result);

        // Verificar se método foi chamado
        verify(myService).someMethod();
    }
}
```

## Melhores Práticas 🎯

- **Mantenha Simples**: Use mocks apenas quando necessário. Evite sobrecarregar testes com muitos mocks.
- **Verificações Claras**: Certifique-se de que as verificações (`verify`) são claras e específicas.
- **Isolamento**: Mantenha os testes isolados, garantindo que não dependem de estados compartilhados.
- **Atualizações**: Mantenha o Mockito atualizado para aproveitar as últimas funcionalidades e correções de bugs.

## Recursos Adicionais 📚

- [Documentação Oficial do Mockito](https://site.mockito.org/)
- [Repositório no GitHub](https://github.com/mockito/mockito)

---

Use este guia para iniciar seus testes com Mockito e explorar todo o potencial do framework para melhorar a qualidade do seu código!
