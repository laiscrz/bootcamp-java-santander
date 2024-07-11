# Operações de Manipulação de Dados com MongoDB 📄🔧

> **Descrição:** Guia básico sobre as principais operações de manipulação de dados no MongoDB, um banco de dados NoSQL orientado a documentos.

O MongoDB oferece diversas operações para manipular dados dentro de suas coleções. Abaixo estão as principais operações suportadas:

## Conexão e Banco de Dados

### Conectando MongoDB via Terminal

Para se conectar ao MongoDB via terminal, utilize o seguinte comando:

```bash
mongo
```

### Mostrando Todos os Bancos de Dados Disponíveis

Para listar todos os bancos de dados disponíveis, utilize o comando:

```javascript
show databases;
```

### Criar / Selecionando um Banco de Dados Específico

Para selecionar um banco de dados específico, utilize o comando:

```javascript
use nome_do_banco;
```

## 1. Criação de Coleções e Inserção de Dados

Para criar uma coleção no MongoDB, basta inserir documentos nela usando o método `insertOne()` ou `insertMany()`. A coleção será criada automaticamente se ainda não existir.

**Exemplo de criação de coleção e inserção de documentos:**

```javascript
// Criando uma coleção e inserindo um documento
db.minhaColecao.insertOne({
    nome: "João",
    idade: 25,
    cidade: "São Paulo"
});
```

```javascript
// Inserindo vários documentos em uma coleção
db.minhaColecao.insertMany([
    { nome: "Maria", idade: 30 },
    { nome: "Pedro", idade: 28 }
]);
```

## 2. Consulta de Dados

Para consultar documentos em uma coleção, utilize o método `find()` com filtros opcionais para buscar documentos que correspondam aos critérios especificados.

**Exemplo de consulta simples:**

```javascript
db.minhaColecao.find({ nome: "João" });
```

## 3. Atualização de Dados

Para atualizar documentos existentes, utilize o método `updateOne()` para atualizar um único documento que corresponda ao filtro especificado ou `updateMany()` para atualizar vários documentos.

**Exemplo de atualização de um documento:**

```javascript
db.minhaColecao.updateOne(
    { nome: "João" },
    { $set: { idade: 26 } }
);
```

## 4. Exclusão de Dados

Para excluir documentos de uma coleção, utilize o método `deleteOne()` para excluir um único documento que corresponda ao filtro especificado ou `deleteMany()` para excluir vários documentos.

**Exemplo de exclusão de um documento:**

```javascript
db.minhaColecao.deleteOne({ nome: "João" });
```

## Criação de Coleção com Opções Avançadas

Você pode criar uma coleção com opções avançadas como coleções com tamanho limitado (`capped collections`) usando o método `createCollection()`.

**Exemplo de criação de coleção com opções avançadas:**

```javascript
db.createCollection("teste", {
    capped: true,
    max: 2,
    size: 2
});

// Mostrar coleções existentes
show collections;
```

Estas operações são fundamentais para manipular dados no MongoDB de maneira eficiente e escalável. Certifique-se de ajustar os métodos e filtros conforme necessário para atender aos requisitos específicos da sua aplicação.

Para explorar mais detalhes sobre as operações CRUD e outros métodos disponíveis, consulte a [Documentação do MongoDB](https://docs.mongodb.com/manual/crud/).

---

> Este guia fornece uma introdução clara e prática sobre como realizar operações de manipulação de dados no MongoDB.
