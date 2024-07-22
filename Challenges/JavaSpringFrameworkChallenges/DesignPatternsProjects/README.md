# Padrões de Projeto - Java e Spring 🌟

> Este desafio tem como objetivo exercitar o conteúdo de Padrões de Projeto utilizando Java.

## Objetivo 🎯
1. **Criação do Projeto em Java Puro (`ProjectJavaPatterns`):**
    - Implementar padrões de projeto clássicos usando apenas Java.
    - Exemplos incluem Singleton, Strategy, Facade, e outros.
    - Foco em aprender e entender a implementação pura dos padrões de projeto.

2. **Criação do Projeto em Spring Framework (`ProjectSpringPatterns`):**
    - Aplicar os padrões de projeto dentro do ecossistema Spring.
    - Utilizar o Spring Boot para criar uma aplicação mais robusta e prática.
    - Integração com APIs externas, bancos de dados, e outras ferramentas do Spring.

## Descrição dos Projetos 📝

### ProjectJavaPatterns ⚙️
Este projeto contém a implementação de vários padrões de projeto utilizando apenas Java puro. Cada padrão é demonstrado com um exemplo prático e bem documentado para facilitar o entendimento.

- **Padrões Implementados:**
  - Singleton 🏰
  - Strategy 🛠️
  - Facade 🎭

### ProjectSpringPatterns 🌿
Este projeto utiliza o Spring Framework para aplicar os padrões de projeto de maneira prática e integrada. Ele inclui a implementação dos mesmos padrões do `ProjectJavaPatterns`, mas utilizando as facilidades e boas práticas do Spring.

- **Funcionalidades do Projeto:**
  - **Integração com API do ViaCEP:** Utiliza OpenFeign para consumir a API de CEP 📦.
  - **Persistência de Dados:** Utiliza Spring Data JPA e H2 Database para gerenciamento de dados 🗄️.
  - **Controle de Clientes:** API RESTful para gerenciar clientes e seus endereços 🧾.
  - **Padrões de Projeto Implementados:**
    - Singleton 🏰
    - Strategy 🛠️
    - Facade 🎭

## Estrutura dos Projetos 📂

### ProjectJavaPatterns ⚙️
```
src/
├── main/
│   ├── java/
│   │   └── one/dio/gof/
│   │       ├── singleton/
│   │       ├── strategy/
│   │       ├── facade/
│   │       └── ...
│   └── resources/
└── test/
```

### ProjectSpringPatterns 🌿
```
src/
├── main/
│   ├── java/
│   │   └── one/dio/gof/
│   │       ├── ProjectSpringPatterns/
│   │       │   ├── controller/
│   │       │   ├── model/
│   │       │   ├── service/
│   │       │   └── repository/
│   └── resources/
│       ├── application.properties
│       └── import.sql
└── test/
```

## Tecnologias Utilizadas 💻

- **ProjectJavaPatterns:**
  - Java 17 ☕

- **ProjectSpringPatterns:**
  - Spring Boot 3.3.2 🌿
  - Spring Data JPA 📊
  - H2 Database 🗄️
  - OpenFeign 📦
  - Maven 🧰

## Como Executar 🚀

### ProjectJavaPatterns ⚙️
1. Clone o repositório 🌀
2. Importe o projeto em sua IDE 🛠️
3. Execute as classes de teste para ver os padrões em ação ▶️

### ProjectSpringPatterns 🌿
1. Clone o repositório 🌀
2. Importe o projeto em sua IDE 🛠️
3. Configure o `application.properties` conforme necessário 📝
4. Execute a aplicação Spring Boot ▶️
5. Utilize ferramentas como Postman para testar as APIs disponíveis 📬

