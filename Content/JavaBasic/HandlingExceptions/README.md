# Java e Tratamento de Exceções ⚠️

> ***Descrição:*** Como lidar com exceções e erros durante a execução de programas Java, incluindo a utilização de try-catch e criação de exceções personalizadas.

## 📚 Projetos e Assunto das Aulas

### Try/Catch -  Sintaxe ⚡️
- Exploração da sintaxe básica de try-catch para capturar e tratar exceções em Java.
- Acesse o projeto: [Link para o classe do Projeto sobre Try/Catch](ProjectJavaException/src/TestExceptions.java)
- Exemplo de sintaxe:

  ```java
  try {
      // código que pode gerar uma exceção
  } catch (TipoDeExcecao1 e1) {
      // tratamento para TipoDeExcecao1
  } catch (TipoDeExcecao2 e2) {
      // tratamento para TipoDeExcecao2
  } finally {
      // bloco opcional para código a ser executado sempre, com ou sem exceção
  }


### Herarquia de Exceções 🌐
- Estudo da hierarquia de exceções em Java, incluindo exceções verificadas (checked) e não verificadas (unchecked).
- Acesse o projeto: [Link para o classe do Projeto sobre Herarquia de Exceções](ProjectJavaException/src/HierarchyExceptions.java)

### Exceções Customizadas 🛠️
- Criação de exceções personalizadas para situações específicas não cobertas pelas exceções padrão de Java.
- Acesse o projeto: [Link para o classe do Projeto sobre Exceções Customizadas](ProjectJavaException/src/CustomExceptions.java)
- Exemplo de Sintaxe:
  
  ```java
  class MinhaExcecao extends Exception {
    // construtor personalizado
    MinhaExcecao(String mensagem) {
        super(mensagem);
    }
  }
  ```

---------------------------------------
> Este README descreve os tópicos de Tratamento de Exceções abordados nas aulas do Bootcamp Santander da DIO, proporcionando um guia prático e teórico para quem está iniciando no aprendizado desta linguagem de programação.
