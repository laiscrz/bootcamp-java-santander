# Ganhando Produtividade com Stream API ⏩

> ***Descrição:*** Uso da Stream API para processar coleções de forma mais eficiente e concisa.

## Contextualizando Stream API 🌐

- A Stream API do Java permite processar coleções de dados de maneira funcional, tornando o código mais legível e conciso. Ela é especialmente útil para operações complexas em coleções, como filtragem, mapeamento e redução.
- Nessa Contextualização, abordamos conceitos como Programação Imperativa e Declarativa, Expressões Lambda, Referências a Métodos.
- Acesse Projeto completo: [Projeto sobre Contextualização do Stream](ContextualizationStream)

### Programação: Imperativa X Declarativa 🔄
- A programação imperativa descreve *como* alcançar um resultado, especificando os passos necessários. Já a programação declarativa foca no *que* deve ser alcançado, deixando que a implementação dos passos fique a cargo da linguagem ou biblioteca.

- Acesse sobre: [Imperativa X Declarativa](ContextualizationStream/src/main/java/imperativeDeclarativeProgramming)

### Lambda Expressions ➡️
- As expressões lambda permitem criar funções anônimas de forma concisa. Elas são uma parte central da programação funcional em Java, facilitando a manipulação de coleções e a implementação de interfaces funcionais.
- Acesse sobre: [Lambda Expressions](ContextualizationStream/src/main/java/LambdaExpressions/ExampleLambda.java)

### Method References 🔗
- As referências a métodos são uma forma de simplificar ainda mais o uso de expressões lambda. Elas permitem referenciar métodos diretamente por seus nomes, tornando o código mais claro e fácil de ler.
- Acesse sobre: [Method References](ContextualizationStream/src/main/java/MethodReference/ExampleMethodReference.java)

## Functional Interface 🔁

As interfaces funcionais são interfaces que possuem um único método abstrato. Elas são a base das expressões lambda e das referências a métodos. Java fornece várias interfaces funcionais na biblioteca `java.util.function`, como `Consumer`, `Supplier`, `Function`, `Predicate` e `BinaryOperator`.

### Introdução às Interfaces Funcionais

As interfaces funcionais permitem tratar comportamentos como objetos, facilitando a passagem de funções como argumentos e a composição de comportamentos.

- 🔂 **Consumer<T>**: Representa uma operação que recebe um argumento e não retorna resultado.
  - Acesse sobre: [Consumer](FunctionalInterfaces/src/main/java/Consumer/ConsumerExample.java)

- 📤 **Supplier<T>**: Representa uma operação que não recebe argumentos e retorna um resultado.
  - Acesse sobre: [Supplier](FunctionalInterfaces/src/main/java/Supplier/SupplierExample.java)

- 🔄 **Function<T, R>**: Representa uma operação que recebe um argumento e retorna um resultado.
  - Acesse sobre: [Function](FunctionalInterfaces/src/main/java/Function/FunctionExample.java)

- 🎯 **Predicate<T>**: Representa uma operação que recebe um argumento e retorna um booleano.
  - Acesse sobre: [Predicate](FunctionalInterfaces/src/main/java/Predicate/PredicateExample.java)

- 🔁 **BinaryOperator<T>**: Representa uma operação sobre dois argumentos do mesmo tipo, retornando um resultado do mesmo tipo.
  - Acesse sobre: [BinaryOperator](FunctionalInterfaces/src/main/java/BinaryOperator/BinaryOperatorExample.java)

### Exercícios (Desafio) 🌟 

- ✴️ **Desafio! Conheça as operações do Stream API**: Pratique as operações da Stream API e aprofunde seu conhecimento.
  - Acesse o desafio: [Exercícios do Stream API](ExercisesStreamAPI)

## Class `Optional` ℹ️
`Optional` é uma classe introduzida no Java 8 que encapsula uma referência que pode ser nula ou não-nula. Ela ajuda a evitar `NullPointerException` e torna o código mais robusto ao forçar o programador a verificar se um valor está presente antes de tentar acessá-lo.

**Sobre:**
- 🆕 **Extra: Conhecendo a Class Optional<T>**: Saiba como utilizar a classe `Optional` para evitar `NullPointerException` e tornar o código mais robusto.
  - Acesse sobre: [Conhecendo a Class Optional](OptionalClass)

- 🛠️ **Extra: Utilizando a Class Optional<T> em um projeto real**: Veja um exemplo prático de uso da classe `Optional` em um projeto.
  - Acesse sobre: [Utilizando a Class Optional em um projeto real](OptionalClass/OptionalUsage)

--------------------------------
> Este README descreve os tópicos de Stream API em Java abordados nas aulas do Bootcamp Santander da DIO, proporcionando um guia prático e teórico para quem está iniciando no aprendizado desta linguagem de programação.
