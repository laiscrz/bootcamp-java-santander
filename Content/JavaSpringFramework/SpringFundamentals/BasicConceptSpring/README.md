# Fundamentos do Spring e Criação de Projeto com Spring Initializr 🍃

> Aprofundando sobre: Fundamentos do Spring Framework.

## O que é o Spring?

O Spring é um framework open-source para o desenvolvimento de aplicações Java. Ele oferece suporte para construção de aplicativos empresariais robustos, seguindo o paradigma de inversão de controle (IoC) e injeção de dependências.

### Injeção de Dependências

Um dos princípios fundamentais do Spring é a inversão de controle (IoC), que permite a criação de aplicações modulares e de fácil manutenção. A injeção de dependências é uma técnica utilizada pelo Spring para gerenciar as dependências entre objetos, eliminando a necessidade de criação manual de instâncias e promovendo um baixo acoplamento entre componentes.

## Spring Initializr 🚀

O Spring Initializr é uma ferramenta online que facilita a inicialização e configuração de projetos Spring. Ele permite aos desenvolvedores gerar rapidamente a estrutura inicial do projeto com as dependências desejadas.

### Criando um Projeto com Spring Initializr

Para criar um novo projeto Spring usando o Spring Initializr:

1. Acesse o [Spring Initializr](https://start.spring.io/).
2. Escolha as configurações do projeto, incluindo a linguagem (geralmente Java), versão do Spring Boot, e o tipo de empacotamento (JAR ou WAR).
3. Configure as dependências necessárias para seu projeto. Por exemplo, dependências comuns incluem Spring Web, Spring Data JPA, Spring Security, entre outras.
4. Clique em "Generate" para baixar o arquivo ZIP contendo o projeto inicial configurado.

### Estrutura do Projeto

Ao descompactar o arquivo ZIP baixado, você encontrará uma estrutura de diretórios e arquivos básicos:

```
meu-projeto/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── exemplo/
│   │   │           └── MeuAplicativoApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── exemplo/
│                   └── MeuAplicativoApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml (ou build.gradle)
└── README.md
```
---

## Spring versus Spring Boot

Enquanto o Spring Framework é baseado no padrão de injeção de dependências, o Spring Boot vai além ao focar na configuração automática. Isso significa que grande parte das configurações necessárias para iniciar um projeto são feitas automaticamente, reduzindo a verbosidade e a complexidade geral da configuração.

### Antes do Spring Boot

Antes do advento do Spring Boot, as configurações em projetos Spring eram frequentemente:

- Dependência individual e gerenciamento manual.
- Verbosidade e complexidade nas configurações.
- Incompatibilidade de versões entre bibliotecas.
- Configurações repetitivas e complexas.

### Era Spring Boot

Com o Spring Boot, esses problemas são mitigados através dos "starters":

- **Starters**: Dependências que agregam outras dependências com um propósito específico, simplificando a configuração no gerenciador de dependências.
- **Benefícios**: Maior coesão entre dependências, garantia de versões compatíveis, otimização do tempo de configuração, configuração simples e foco direto no desenvolvimento do negócio.

### Exemplo de Controle de Dependências com e sem Spring Boot Starter

Veja como a utilização de starters pode simplificar o controle de dependências:

#### Sem Spring Boot Starter:

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.3.9</version>
</dependency>
```

#### Com Spring Boot Starter:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>2.5.2</version>
</dependency>
```

### Alguns Starters Comuns do Spring Boot

- **spring-boot-starter-data-jpa**: Integração ao banco de dados via JPA - Hibernate.
- **spring-boot-starter-data-mongodb**: Interação com banco de dados MongoDB.
- **spring-boot-starter-web**: Inclusão do container Tomcat para aplicações REST.
- **spring-boot-starter-web-services**: Webservices baseados na arquitetura SOAP.
- **spring-boot-starter-batch**: Implementação de jobs de processos.
- **spring-boot-starter-test**: Recursos para testes unitários como JUnit.
- **spring-boot-starter-openfeign**: Client HTTP baseado em interfaces.
- **spring-boot-starter-actuator**: Gerenciamento de monitoramento da aplicação.

---

## Comparação com Java EE

O Spring e o Java EE (ou Jakarta EE) são frameworks populares para o desenvolvimento de aplicações Java empresariais. Enquanto o Java EE oferece uma especificação para um conjunto de APIs, o Spring é um framework mais abrangente e flexível, com suporte para diversas áreas como web, persistência, segurança e mais. Algumas diferenças principais incluem:

- **Inversão de Controle (IoC)**: O Spring utiliza IoC como princípio fundamental, facilitando a injeção de dependências e tornando o código mais modular e testável.
- **Configuração**: Spring oferece configuração por anotações (como @Autowired) e XML, enquanto o Java EE tende a usar mais XML para configurações.
- **Flexibilidade**: Spring permite escolher entre várias implementações de tecnologias, enquanto o Java EE geralmente define uma especificação única com uma implementação padrão.

---

## Documentação Adicional

Para mais informações sobre o Spring e suas funcionalidades, consulte a [documentação oficial do Spring Framework](https://spring.io/projects/spring-framework).

---

> Este README fornece uma introdução aos fundamentos do Spring, como iniciar um projeto usando o Spring Initializr, discute a injeção de dependências e compara o Spring com o Java EE. Personalize-o conforme necessário para atender às especificidades do seu projeto e do ambiente de desenvolvimento.
