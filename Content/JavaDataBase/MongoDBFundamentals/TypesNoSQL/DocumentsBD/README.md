# Bancos de Dados - NoSQL de Documentos 📄

> **Descrição:** Introdução aos bancos de dados de documentos, suas características, casos de uso e exemplos práticos de sintaxe.

## 📚 Conteúdo

1. [Introdução aos Bancos de Dados de Documentos](#introdução-aos-bancos-de-dados-de-documentos-)
2. [Características](#características)
3. [Casos de Uso](#casos-de-uso)
4. [Operações CRUD e Inserção de Dados](#operações-crud-e-inserção-de-dados)
   - [MongoDB](#mongodb)
   - [CouchDB](#couchdb)

## Introdução aos Bancos de Dados de Documentos 📄

Bancos de dados de documentos são uma categoria de banco de dados NoSQL que armazena dados na forma de documentos semelhantes ao JSON (JavaScript Object Notation). Cada documento é uma unidade independente que pode conter estruturas complexas de dados aninhados.

## Características

- **Estrutura Flexível**: Os documentos podem ter estruturas diferentes dentro da mesma coleção.
- **Escalabilidade Horizontal**: Fácil de escalar para grandes volumes de dados.
- **Alto Desempenho**: Desempenho otimizado para leitura e escrita de documentos complexos.

## Casos de Uso

- **Aplicações Web e Móveis**: Armazenamento de dados dinâmicos e aninhados.
- **Sistemas de Gerenciamento de Conteúdo**: Modelagem de documentos com diferentes formatos.
- **Catálogos de Produtos**: Armazenamento de informações de produtos com atributos variáveis.

## Operações CRUD e Inserção de Dados

As operações CRUD são fundamentais para qualquer banco de dados, representando as ações de **C**reate (criar), **R**ead (ler), **U**pdate (atualizar) e **D**elete (deletar). Abaixo, mostramos como realizar essas operações em MongoDB e CouchDB.

### MongoDB

#### Conexão com o MongoDB

```bash
mongo
```

#### Inserção de Dados

```javascript
db.usuarios.insertOne({
  nome: "João Silva",
  idade: 30,
  endereco: {
    rua: "Rua A",
    numero: 123,
    cidade: "São Paulo",
    estado: "SP"
  }
})

// Inserindo múltiplos documentos
db.usuarios.insertMany([
  { nome: "Maria Santos", idade: 25, endereco: { rua: "Rua B", numero: 456, cidade: "Rio de Janeiro", estado: "RJ" } },
  { nome: "Pedro Almeida", idade: 35, endereco: { rua: "Rua C", numero: 789, cidade: "Belo Horizonte", estado: "MG" } }
])
```

#### Leitura de Dados

```javascript
// Encontrando um documento
db.usuarios.findOne({ nome: "João Silva" })

// Encontrando múltiplos documentos
db.usuarios.find({ "endereco.cidade": "São Paulo" }).pretty()
```

#### Atualização de Dados

```javascript
// Atualizando um documento
db.usuarios.updateOne(
  { nome: "João Silva" },
  { $set: { idade: 31 } }
)

// Atualizando múltiplos documentos
db.usuarios.updateMany(
  { "endereco.estado": "SP" },
  { $set: { "endereco.estado": "São Paulo" } }
)
```

#### Deleção de Dados

```javascript
// Deletando um documento
db.usuarios.deleteOne({ nome: "João Silva" })

// Deletando múltiplos documentos
db.usuarios.deleteMany({ "endereco.cidade": "São Paulo" })
```

### CouchDB

#### Conexão com o CouchDB

Primeiro, certifique-se de que o CouchDB está em execução e que você tem acesso ao seu dashboard (Fauxton) ou pode utilizar ferramentas como `curl` ou bibliotecas específicas de linguagem para interagir com ele.

#### Inserção de Dados

```bash
# Usando curl para inserir um documento
curl -X PUT http://localhost:5984/usuarios/joao_silva -d '{
  "nome": "João Silva",
  "idade": 30,
  "endereco": {
    "rua": "Rua A",
    "numero": 123,
    "cidade": "São Paulo",
    "estado": "SP"
  }
}' -H "Content-Type: application/json"
```

#### Leitura de Dados

```bash
# Usando curl para ler um documento
curl -X GET http://localhost:5984/usuarios/joao_silva
```

#### Atualização de Dados

```bash
# Usando curl para atualizar um documento
# Primeiro, obtenha a _rev (revisão) atual do documento
curl -X GET http://localhost:5984/usuarios/joao_silva

# Depois, use a _rev para atualizar o documento
curl -X PUT http://localhost:5984/usuarios/joao_silva -d '{
  "_rev": "1-23456789012345678901234567890123",
  "nome": "João Silva",
  "idade": 31,
  "endereco": {
    "rua": "Rua A",
    "numero": 123,
    "cidade": "São Paulo",
    "estado": "SP"
  }
}' -H "Content-Type: application/json"
```

#### Deleção de Dados

```bash
# Usando curl para deletar um documento
curl -X DELETE http://localhost:5984/usuarios/joao_silva?rev=1-23456789012345678901234567890123
```

### Exemplo Completo - CouchDB

```bash
# Inserindo múltiplos documentos
curl -X POST http://localhost:5984/usuarios -d '{
  "docs": [
    { "_id": "maria_santos", "nome": "Maria Santos", "idade": 25, "endereco": { "rua": "Rua B", "numero": 456, "cidade": "Rio de Janeiro", "estado": "RJ" } },
    { "_id": "pedro_almeida", "nome": "Pedro Almeida", "idade": 35, "endereco": { "rua": "Rua C", "numero": 789, "cidade": "Belo Horizonte", "estado": "MG" } }
  ]
}' -H "Content-Type: application/json"

# Encontrando documentos com idade maior que 30
curl -X POST http://localhost:5984/usuarios/_find -d '{
  "selector": {
    "idade": { "$gt": 30 }
  }
}' -H "Content-Type: application/json"

# Atualizando a idade de Maria Santos
# Obtenha a _rev atual do documento
curl -X GET http://localhost:5984/usuarios/maria_santos

# Use a _rev para atualizar o documento
curl -X PUT http://localhost:5984/usuarios/maria_santos -d '{
  "_rev": "1-23456789012345678901234567890123",
  "nome": "Maria Santos",
  "idade": 26,
  "endereco": {
    "rua": "Rua B",
    "numero": 456,
    "cidade": "Rio de Janeiro",
    "estado": "RJ"
  }
}' -H "Content-Type: application/json"

# Deletando o documento de Pedro Almeida
curl -X DELETE http://localhost:5984/usuarios/pedro_almeida?rev=1-23456789012345678901234567890123
```

---

> Este README fornece uma visão abrangente dos bancos de dados de documentos, destacando suas características, casos de uso e exemplos práticos com MongoDB e CouchDB. Compreender a modelagem e a manipulação de documentos é essencial para otimizar a gestão de dados em aplicações modernas.
