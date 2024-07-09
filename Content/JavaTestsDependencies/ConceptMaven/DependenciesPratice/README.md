# 📘 Gerenciamento de Dependências com Maven

> Entendendo o conceito de Dependências do Maven.

## 📋 Introdução

Este projeto utiliza o Apache Maven como ferramenta de automação de compilação e gerenciamento de dependências. Maven simplifica o processo de construção, documentação e gestão do ciclo de vida do projeto.

## 📦 Dependências

As dependências em um projeto Maven são bibliotecas ou componentes que o projeto necessita para funcionar corretamente. Elas são especificadas no arquivo `pom.xml` e podem incluir bibliotecas de terceiros, bibliotecas próprias ou outros módulos do projeto. Maven baixa e gerencia essas dependências automaticamente, garantindo que todas as bibliotecas necessárias estejam disponíveis durante a compilação e execução do projeto.

### 🛠️ Tipos de Dependências

1. **Dependências Diretas**: 
   - São as bibliotecas que o projeto utiliza diretamente.
   - Exemplo: uma biblioteca de logging como `log4j`.

2. **Dependências Transitivas**: 
   - São bibliotecas necessárias pelas dependências diretas.
   - Maven resolve essas dependências automaticamente.

### 📑 Tipos de Escopo de Dependência

O escopo de uma dependência define em que fase do ciclo de vida do build ela será incluída. Os escopos mais comuns são:

1. **compile** (padrão) 🛠️
   - Disponível em todas as fases (compilação, teste, runtime, etc.).
   - Não precisa ser explicitamente declarado.

2. **provided** 🚚
   - Similar ao `compile`, mas não é incluído no pacote final.
   - Exemplo: bibliotecas fornecidas pelo contêiner de servlet (como `javax.servlet`).

3. **runtime** 🏃
   - Necessário apenas em tempo de execução.
   - Exemplo: drivers de banco de dados.

4. **test** 🧪
   - Disponível apenas durante a fase de teste.
   - Exemplo: frameworks de teste como `JUnit`.

5. **system** 🖥️
   - Similar ao `provided`, mas requer a especificação explícita do caminho do JAR no sistema.
   - Não recomendado devido à falta de portabilidade.

## 📝 Exemplo de Configuração de Dependências

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.8</version>
        <scope>compile</scope>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

Neste exemplo, `spring-core` é uma dependência de compilação e `junit` é uma dependência de teste.

---

Com essa configuração, você está pronto para gerenciar as dependências do seu projeto de forma eficiente usando o Maven! 🚀
