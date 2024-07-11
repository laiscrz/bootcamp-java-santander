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

**Exemplo de consulta utilizando o operador $in:**

```javascript
db.minhaColecao.find({ nome: { $in: ["João", "Maria"] } });
```

### Operadores
Veja a tabela com alguns dos operadores mais comuns no MongoDB, incluindo sua sintaxe e o que cada um faz:

| Operador    | Sintaxe                                     | Descrição                                                  |
|-------------|---------------------------------------------|------------------------------------------------------------|
| `$eq`       | `{ campo: { $eq: valor } }`                  | Documentos onde o campo é igual ao valor especificado.     |
| `$ne`       | `{ campo: { $ne: valor } }`                  | Documentos onde o campo é diferente do valor especificado. |
| `$gt`       | `{ campo: { $gt: valor } }`                  | Documentos onde o campo é maior que o valor especificado.  |
| `$gte`      | `{ campo: { $gte: valor } }`                 | Documentos onde o campo é maior ou igual ao valor especificado. |
| `$lt`       | `{ campo: { $lt: valor } }`                  | Documentos onde o campo é menor que o valor especificado.   |
| `$lte`      | `{ campo: { $lte: valor } }`                 | Documentos onde o campo é menor ou igual ao valor especificado. |
| `$in`       | `{ campo: { $in: [valor1, valor2, ...] } }`   | Documentos onde o campo contém um valor dentro do array especificado. |
| `$nin`      | `{ campo: { $nin: [valor1, valor2, ...] } }`  | Documentos onde o campo não contém nenhum dos valores do array especificado. |
| `$and`      | `{ $and: [ { condição1 }, { condição2 } ] }` | Documentos que satisfazem todas as condições especificadas. |
| `$or`       | `{ $or: [ { condição1 }, { condição2 } ] }`  | Documentos que satisfazem pelo menos uma das condições especificadas. |
| `$not`      | `{ campo: { $not: { $eq: valor } } }`        | Documentos onde o campo não é igual ao valor especificado. |
| `$nor`      | `{ $nor: [ { condição1 }, { condição2 } ] }` | Documentos que não satisfazem nenhuma das condições especificadas. |
| `$exists`   | `{ campo: { $exists: true/false } }`         | Documentos onde o campo existe (true) ou não existe (false). |
| `$regex`    | `{ campo: { $regex: /padrão/ } }`            | Documentos onde o valor do campo corresponde ao padrão de expressão regular especificado. |
| `$all`      | `{ campo: { $all: [valor1, valor2, ...] } }`  | Documentos onde o campo contém todos os valores do array especificado. |
| `$elemMatch`| `{ campo: { $elemMatch: { subcampo: valor } } }` | Documentos onde ao menos um elemento do campo satisfaz a condição especificada. |

> [!NOTE]
> Esses operadores permitem construir consultas complexas e específicas no MongoDB, adaptando-se às necessidades de busca e manipulação de dados dentro das coleções.

## 3. Atualização de Dados

Para atualizar documentos existentes, utilize o método `updateOne()` para atualizar um único documento que corresponda ao filtro especificado ou `updateMany()` para atualizar vários documentos.

**Exemplo de atualização de um documento:**

```javascript
db.minhaColecao.updateOne(
    { nome: "João" },
    { $set: { idade: 26 } }
);
```

**Exemplo de atualização de vários documentos:**

```javascript
db.minhaColecao.updateMany(
    { cidade: "São Paulo" },
    { $set: { idade: 30 } }
);
```

## 4. Exclusão de Dados

Para excluir documentos de uma coleção, utilize o método `deleteOne()` para excluir um único documento que corresponda ao filtro especificado ou `deleteMany()` para excluir vários documentos.

**Exemplo de exclusão de um documento:**

```javascript
db.minhaColecao.deleteOne({ nome: "João" });
```

**Exemplo de exclusão de vários documentos:**

```javascript
db.minhaColecao.deleteMany({ idade: { $gte: 30 } });
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
