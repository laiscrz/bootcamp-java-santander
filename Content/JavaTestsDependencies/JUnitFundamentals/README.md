# Testes Unitários com JUnit ⚗️

- JUnit é um framework popular de código aberto para Java utilizado para escrever e executar testes automatizados repetíveis.
- Ele fornece anotações e assertivas para simplificar o processo de teste, garantindo que seu código Java se comporte conforme esperado.
- JUnit é amplamente utilizado para testes unitários, que envolvem testar unidades individuais ou componentes de uma aplicação de software de forma isolada.

## Por que usar JUnit? 🚀

- **Automação**: JUnit permite automatizar o processo de teste, facilitando e acelerando a execução de testes repetidamente.
  
- **Assertivas**: Oferece assertivas integradas para verificar os resultados esperados dos testes.
  
- **Integração**: Integra facilmente com ferramentas de build como Maven e Gradle para integração contínua e pipelines de deploy.
  
- **Cobertura**: Ajuda a alcançar uma maior cobertura de código, assegurando que mais partes da sua base de código sejam testadas.

## Como começar 🛠️

Para começar com JUnit, siga estes passos:

1. **Configuração**: Certifique-se de que o JUnit está incluído nas dependências do seu projeto. Se estiver usando Maven, adicione a dependência do JUnit ao seu `pom.xml`:
   ```xml
   <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.13.2</version>
       <scope>test</scope>
   </dependency>
   ```
   Substitua `4.13.2` pela versão mais recente do JUnit.

2. **Escrever Testes**: Crie classes de teste no seu projeto seguindo a convenção de nomenclatura `*Test.java`. Use anotações como `@Test` para marcar os métodos de teste.
   ```java
   import org.junit.Test;
   import static org.junit.Assert.assertEquals;
   
   public class MeuTesteUnitario {
   
       @Test
       public void testarAdicao() {
           int resultado = 2 + 2;
           assertEquals(4, resultado);
       }
   }
   ```

3. **Executar Testes**: Execute seus testes usando sua IDE ou ferramenta de build. JUnit irá relatar os resultados, indicando se cada teste passou ou falhou.

## Anatomia de Teste 📝

### Classe de Teste

- **Nome da Classe**: Sugere-se sempre usar o mesmo nome da Classe que está sendo testada adicionando o sufixo “Test”.

### Método de Teste
- Sugere-se usar um nome bastante descritivo sobre o cenário ou comportamento esperado a ser testado.

### Anotações (Annotations)

- **@Test**: Marca um método como um método de teste.
- **@BeforeEach / @BeforeAll**: Executa métodos antes de cada teste / antes de todos os testes.
- **@AfterEach / @AfterAll**: Executa métodos após cada teste / após todos os testes.
- **@ParameterizedTest**: Permite a execução de um mesmo teste com diferentes argumentos.
- **@Disabled**: Desabilita um método de teste para ser executado.
- **@Timeout**: Define um tempo limite para a execução do método de teste.

### Assertivas (Assertions)

- **assertEquals() / assertNotEquals()**: Verifica se dois valores são iguais / diferentes.
- **assertTrue() / assertFalse()**: Verifica se uma condição é verdadeira / falsa.
- **assertThrows() / assertDoesNotThrow()**: Verifica se uma exceção é lançada / não é lançada.
- **assertNull() / assertNotNull()**: Verifica se um valor é nulo / não é nulo.

## Melhores Práticas 🎯

- **Isolamento**: Testes devem ser independentes e não depender uns dos outros para o estado.
  
- **Nomenclatura**: Use nomes descritivos para seus métodos de teste para esclarecer seu propósito.
  
- **Assertivas**: Inclua assertivas significativas para validar o comportamento esperado.
  
- **Cobertura**: Procure uma cobertura de código abrangente para minimizar caminhos de código não testados.

## Benefícios dos Testes Unitários com JUnit ⭐

- **Detecção Precoce de Bugs**: Identifique problemas no início do ciclo de desenvolvimento.
  
- **Confiança em Refatorações**: Garanta que as alterações não introduzam efeitos colaterais não desejados.
  
- **Documentação Executável**: Sirva como documentação executável do comportamento esperado do seu código.

