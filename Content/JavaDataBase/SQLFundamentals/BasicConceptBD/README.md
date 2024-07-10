# Conceitos Básicos de Banco de Dados 📖

> Aprofundamento inicial sobre Banco de Dados.

## Conceitos Gerais

### O que é um Banco de Dados? 🗄️

Um Banco de Dados é um sistema organizado para armazenar e gerenciar conjuntos de dados. Ele permite a criação, consulta, atualização e administração de informações de forma estruturada.

### O que é SGBD? 💻

SGBD (Sistema de Gerenciamento de Banco de Dados) é um software que facilita o gerenciamento de bancos de dados, oferecendo interfaces para usuários e aplicativos interagirem com os dados de maneira eficiente e segura.

### Tipos de Banco 📊

- Relacionais (SQL)
- Não Relacionais (NoSQL)
- Orientado a Objetos
- Hierárquico

### Estrutura Geral de Banco de Dados 🏛️

Um Banco de Dados Relacional geralmente é estruturado da seguinte forma:

- **Tabela:** Estrutura básica que armazena dados em linhas (registros) e colunas (campos).
- **Colunas:** Definem os tipos de dados que cada registro pode conter.
- **Relacionamentos (Chaves primárias e Estrangeiras):** Estabelecem conexões entre diferentes tabelas para representar dados relacionados.
- **Linhas (Tuplas ou Registros):** Conjuntos individuais de dados armazenados em uma tabela.

### Características 🌐

Bancos de Dados Relacionais possuem diversas características importantes:

- Relacionamento entre tabelas
- Linguagem de Consulta Estruturada (SQL)
- Integridade referencial
- Normalização de Dados
- Segurança
- Flexibilidade e extensibilidade
- Suporte a transações ACID

----

## Conceitos sobre SQL

### 1. Introdução aos Bancos de Dados Relacionais (SQL) 📊

Bancos de Dados Relacionais são sistemas de gerenciamento de dados estruturados que utilizam o modelo relacional para armazenar informações. Aqui estão alguns conceitos básicos:

- **Tabelas:** Os dados são organizados em tabelas, que consistem em linhas (registros) e colunas (campos). Cada tabela possui um nome único e é composta por uma ou mais colunas que representam os diferentes tipos de dados a serem armazenados.

- **Chaves Primárias e Chaves Estrangeiras:** 
  - **Chave Primária:** Uma coluna ou conjunto de colunas que identifica exclusivamente cada linha em uma tabela. Garante a integridade dos dados e permite indexação rápida.
  - **Chave Estrangeira:** Uma coluna ou conjunto de colunas que estabelece uma relação entre duas tabelas. A chave estrangeira refere-se à chave primária de outra tabela, facilitando a navegação e a consulta de dados relacionados.

- **Consultas SQL:** SQL (Structured Query Language) é a linguagem padrão para realizar consultas e manipulações em bancos de dados relacionais. Permite criar, consultar, atualizar e excluir dados de forma eficiente e precisa.

### 2. Modelagem de Dados Relacionais 🛠️

A modelagem de dados envolve o processo de projetar a estrutura de um banco de dados relacional, incluindo a definição de tabelas, relacionamentos, chaves primárias, chaves estrangeiras e índices. Uma boa modelagem de dados garante que o banco de dados seja eficiente, escalável e mantenha a integridade dos dados.

### 3. Linguagem SQL 🖥️

SQL oferece várias funcionalidades poderosas para manipular dados em bancos de dados relacionais:
- **DDL (Data Definition Language):** Define a estrutura e a organização dos dados no banco de dados (exemplos: CREATE, ALTER, DROP).
- **DML (Data Manipulation Language):** Manipula os dados existentes no banco de dados (exemplos: SELECT, INSERT, UPDATE, DELETE).
- **DQL (Data Query Language):** Realiza consultas para recuperar informações específicas do banco de dados (exemplo: SELECT).
- **DCL (Data Control Language):** Gerencia privilégios e controle de acesso aos dados (exemplos: GRANT, REVOKE).
- **DTL (Data Transaction Language):** Gerencia transações que garantem a atomicidade, consistência, isolamento e durabilidade (ACID) das operações no banco de dados, incluindo operações COMMIT e ROLLBACK.

## Dicas de Nomenclatura para Bancos de Dados Relacionais 🌐

Ao nomear objetos no banco de dados, é importante seguir algumas práticas recomendadas:

- **Começar com Letra ou Sublinhado (_):** Os nomes devem começar com uma letra ou com um caractere de sublinhado (_).
- **Caracteres Permitidos:** Os nomes podem conter letras, números e caracteres de sublinhado (_).
- **Sensibilidade a Maiúsculas e Minúsculas:** Muitos sistemas de banco de dados diferenciam maiúsculas de minúsculas nos nomes de objetos.
- **Clareza e Consistência:** Escolha nomes que sejam claros e descritivos para evitar ambiguidades.
- **Evitar Palavras Reservadas:** Evite usar palavras reservadas do SQL como nomes de objetos (por exemplo, "table", "select", "insert", etc.).

## Recursos Adicionais 📘

Para aprender mais sobre Bancos de Dados Relacionais e SQL, recomenda-se explorar tutoriais online, documentações oficiais de SGBDs como MySQL, PostgreSQL, Oracle, entre outros, e praticar com exemplos de consultas SQL.

---

Este README.md fornece uma introdução clara aos conceitos fundamentais de Bancos de Dados Relacionais (SQL), ajudando a entender como os dados são estruturados e manipulados em sistemas de banco de dados.
