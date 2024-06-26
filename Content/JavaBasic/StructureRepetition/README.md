# Estruturas de Repetição em Java 🔁

> ***Descrição:*** Exploração dos loops (for, while, do-while) para executar blocos de código repetidamente até que uma condição específica seja atendida.

## 📚 Projetos e Assunto das Aulas

### For 🔄
- Exploração do loop `for` para iterar um número fixo de vezes.
- Acesse o projeto: [Link para a classe do Projeto sobre For](TypesLoops/src/LoopFor.java)
- Exemplo de sintaxe:
  
  ```java
  for (int i = 0; i < 10; i++) {
      System.out.println(i);
  }
    ```
  
### For em Arrays 📋
- Utilização do loop `for` para iterar sobre elementos de arrays.
- Acesse o projeto: [Link para a classe do Projeto sobre For em Arrays](TypesLoops/src/LoopForArray.java)
- Exemplo de sintaxe:
  
  ```java
  int[] array = {1, 2, 3, 4, 5};
  for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
  }
  ```

### ForEach 🔄📋
- Uso do loop `for-each` para iterar diretamente sobre coleções e arrays de maneira simplificada.
- Acesse o projeto: [Link para a classe do Projeto sobre ForEach](TypesLoops/src/LoopForEach.java)
- Exemplo de sintaxe:
  
  ```java
  int[] array = {1, 2, 3, 4, 5};
  for (int num : array) {
      System.out.println(num);
  }
  ```

### Uso Break e Continue ⏹️⏭️
- Como utilizar as instruções `break` e `continue` para controlar o fluxo dos loops.
- Acesse o projeto: [Link para a classe do Projeto sobre Break e Continue](TypesLoops/src/ExampleBreakContinue.java)
- Exemplo de sintaxe:
  
  ```java
  for (int i = 0; i < 10; i++) {
      if (i == 5) {
          break; // Sai do loop quando i é 5
      }
      if (i % 2 == 0) {
          continue; // Pula para a próxima iteração quando i é par
      }
      System.out.println(i);
  }
  ```

### While 🔁
- Exploração do loop `while` para executar um bloco de código enquanto uma condição é verdadeira.
- Acesse o projeto: [Link para a classe do Projeto sobre While](TypesLoops/src/LoopWhile.java)
- Exemplo de sintaxe:
  
  ```java
  int i = 0;
  while (i < 10) {
      System.out.println(i);
      i++;
  }
  ```

### Do While 🔁🔽
- Utilização do loop `do-while` para garantir que o bloco de código seja executado pelo menos uma vez.
- Acesse o projeto: [Link para a classe do Projeto sobre Do While](TypesLoops/src/LoopDoWhile.java)
- Exemplo de sintaxe:
  
  ```java
  int i = 0;
  do {
      System.out.println(i);
      i++;
  } while (i < 10);
  ```

---------------------------------
> Este README descreve os tópicos de Estruturas de Repetição abordados nas aulas do Bootcamp Santander da DIO, proporcionando um guia prático e teórico para quem está iniciando no aprendizado desta linguagem de programação.
