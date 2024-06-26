# Introdução e Estruturas Condicionais em Java 🔄

> ***Descrição:*** Estudo das estruturas de controle condicionais (if-else, switch) em Java, permitindo a criação de fluxos de execução baseados em condições.

## 📚 Projetos e Assunto das Aulas

### Tipos de Estruturas Condicionais
- Conhecendo as estruturas condicionais.
- Acesse o projeto: [Link para o Projeto de Projeto](TypesConditional)
  
### Condicional Simples 🎯
- Estrutura condicional que executa um bloco de código se uma condição for verdadeira.
- Acesse o projeto: [Link para o classe do Projeto sobre Condicional Simples](TypesConditional/src/ConditionalSimple.java)
- Exemplo de sintaxe:
  
  ```java
  int idade = 18;
  if (idade >= 18) {
      System.out.println("Você é maior de idade.");
  }
  ```
  
### Condicional Composta 🔄
- Estrutura condicional que executa um bloco de código se uma condição for verdadeira e outro bloco se for falsa.
- Acesse o projeto: [Link para o classe do Projeto sobre Condicional Composta](TypesConditional/src/ConditionalCompound.java)
- Exemplo de sintaxe:

  ```java
  int idade = 16;
  if (idade >= 18) {
      System.out.println("Você é maior de idade.");
  } else {
      System.out.println("Você é menor de idade.");
  }
  ```

### Condicional Encadeada 🔗
- Estrutura condicional que encadeia várias condições, executando diferentes blocos de código conforme cada condição.
- Acesse o projeto: [Link para o classe do Projeto sobre Condicional Encadeada](TypesConditional/src/ConditionalChained.java)
- Exemplo de sintaxe:

  ```java
  int nota = 85;
  if (nota >= 90) {
      System.out.println("A");
  } else if (nota >= 80) {
      System.out.println("B");
  } else if (nota >= 70) {
      System.out.println("C");
  } else if (nota >= 60) {
      System.out.println("D");
  } else {
      System.out.println("F");
  }
  ```

### Condicional Ternária ➡️
- Operador condicional que atribui um valor a uma variável com base em uma condição booleana.
- Acesse o projeto: [Link para o classe do Projeto sobre Condicional Ternaria](TypesConditional/src/ConditionalTernary.java)
- Exemplo de sintaxe:

  ```java
  int idade = 18;
  String mensagem = (idade >= 18) ? "Você é maior de idade." : "Você é menor de idade.";
  System.out.println(mensagem);
  ```

### Switch Case 🔁
- Estrutura condicional que permite avaliar uma variável ou expressão com várias opções diferentes.
- Acesse o projeto: [Link para o classe do Projeto sobre Condicional Switch Case](TypesConditional/src/ConditionalSwitchCase.java)
- Exemplo de sintaxe:

  ```java
  int diaDaSemana = 3;
  switch (diaDaSemana) {
      case 1:
          System.out.println("Domingo");
          break;
      case 2:
          System.out.println("Segunda-feira");
          break;
      case 3:
          System.out.println("Terça-feira");
          break;
      case 4:
          System.out.println("Quarta-feira");
          break;
      case 5:
          System.out.println("Quinta-feira");
          break;
      case 6:
          System.out.println("Sexta-feira");
          break;
      case 7:
          System.out.println("Sábado");
          break;
      default:
          System.out.println("Dia inválido");
          break;
  }
  ```

--------------------------------
> Este README descreve os tópicos de Estruturas Condicionais abordados nas aulas do Bootcamp Santander da DIO, proporcionando um guia prático e teórico para quem está iniciando no aprendizado desta linguagem de programação.
