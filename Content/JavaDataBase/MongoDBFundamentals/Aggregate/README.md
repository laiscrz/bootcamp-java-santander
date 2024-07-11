# Agregações no MongoDB 📊

O MongoDB oferece um poderoso framework de agregação que permite realizar operações de processamento de dados complexas e transformações em documentos dentro de uma coleção. As agregações são úteis para realizar análises avançadas, cálculos de métricas e resumos de dados de maneira eficiente.

## Introdução às Agregações

As agregações no MongoDB são realizadas usando a pipeline de agregação, que consiste em uma série de estágios (stages) que processam documentos de entrada sequencialmente. Cada estágio transforma os documentos de alguma maneira até que o resultado final seja produzido.

### Estrutura Básica da Pipeline de Agregação

A pipeline de agregação consiste em um conjunto de estágios, cada um executando uma operação específica nos documentos de entrada. Aqui está um exemplo simples de pipeline de agregação:

```javascript
db.minhaColecao.aggregate([
    { $match: { campo: valor } },
    { $group: { _id: "$campo", total: { $sum: 1 } } },
    { $sort: { total: -1 } },
    { $limit: 10 }
]);
```

Neste exemplo:
- **$match**: Filtra os documentos que correspondem ao critério especificado.
- **$group**: Agrupa os documentos baseado no campo especificado e calcula um total.
- **$sort**: Ordena os documentos com base no total calculado.
- **$limit**: Limita o número de documentos retornados.

---

### Principais Estágios de Agregação

Aqui estão os principais estágios de agregação no MongoDB, com uma breve descrição de cada um:

| Estágio        | Descrição                                                                                       |
|----------------|-------------------------------------------------------------------------------------------------|
| **$match**     | Filtra os documentos de entrada para permitir que apenas os documentos desejados continuem.    |
| **$group**     | Agrupa documentos de acordo com um campo específico e executa operações de agregação neles.    |
| **$sort**      | Ordena os documentos de saída com base em um ou mais campos.                                    |
| **$project**   | Reshape os documentos de saída, incluindo, excluindo ou renomeando campos.                      |
| **$limit**     | Limita o número de documentos de saída.                                                         |
| **$unwind**    | Deconstrói um array de documentos para um documento por elemento do array.                      |
| **$addFields** | Adiciona novos campos aos documentos de saída.                                                  |

---

### Funções de Agregação Comuns

Aqui estão algumas funções de agregação comuns utilizadas no MongoDB:

| Função     | Descrição                                                                                       | Exemplo                                    |
|------------|-------------------------------------------------------------------------------------------------|--------------------------------------------|
| **$sum**   | Calcula a soma dos valores de um campo específico em todos os documentos do grupo.              | `{ $group: { _id: "$categoria", total: { $sum: "$quantidade" } } }` |
| **$min**   | Retorna o valor mínimo de um campo específico em todos os documentos do grupo.                  | `{ $group: { _id: "$categoria", menorPreco: { $min: "$preco" } } }` |
| **$max**   | Retorna o valor máximo de um campo específico em todos os documentos do grupo.                  | `{ $group: { _id: "$categoria", maiorPreco: { $max: "$preco" } } }` |
| **$avg**   | Calcula a média dos valores de um campo específico em todos os documentos do grupo.             | `{ $group: { _id: "$categoria", mediaPreco: { $avg: "$preco" } } }` |
| **$count** | Retorna o número de documentos em um estágio de agregação.                                       | `{ $group: { _id: "$categoria", count: { $sum: 1 } } }`           |

---

### Operadores Lógicos

Aqui estão alguns operadores lógicos comuns utilizados no MongoDB:

| Operador   | Descrição                                                                                       | Exemplo                                    |
|------------|-------------------------------------------------------------------------------------------------|--------------------------------------------|
| **$and**   | Seleciona documentos que atendem a todas as condições especificadas.                            | `{ $match: { $and: [ { campo1: valor1 }, { campo2: valor2 } ] } }` |
| **$or**    | Seleciona documentos que atendem a pelo menos uma das condições especificadas.                  | `{ $match: { $or: [ { campo1: valor1 }, { campo2: valor2 } ] } }` |
| **$not**   | Seleciona documentos que não atendem à condição especificada.                                   | `{ $match: { campo: { $not: { $eq: valor } } } }` |
| **$nor**   | Seleciona documentos que não atendem a nenhuma das condições especificadas.                     | `{ $match: { $nor: [ { campo1: valor1 }, { campo2: valor2 } ] } }` |

---

### Operadores de Comparação

Aqui estão alguns operadores de comparação comuns utilizados no MongoDB:

| Operador   | Descrição                                                                                       | Exemplo                                    |
|------------|-------------------------------------------------------------------------------------------------|--------------------------------------------|
| **$eq**  (=)  | Seleciona documentos em que o valor de um campo é igual ao valor especificado.                   | `{ $match: { campo: { $eq: valor } } }`     |
| **$ne** (<>)   | Seleciona documentos em que o valor de um campo não é igual ao valor especificado.               | `{ $match: { campo: { $ne: valor } } }`     |
| **$gt** (>) | Seleciona documentos em que o valor de um campo é maior que o valor especificado.                | `{ $match: { campo: { $gt: valor } } }`     |
| **$gte** (>=) | Seleciona documentos em que o valor de um campo é maior ou igual ao valor especificado.           | `{ $match: { campo: { $gte: valor } } }`    |
| **$lt**  (<)  | Seleciona documentos em que o valor de um campo é menor que o valor especificado.                | `{ $match: { campo: { $lt: valor } } }`     |
| **$lte**  (<=) | Seleciona documentos em que o valor de um campo é menor ou igual ao valor especificado.           | `{ $match: { campo: { $lte: valor } } }`    |

---

## Exemplos de Uso

### Contagem de Documentos por Campo

```javascript
db.minhaColecao.aggregate([
    { $group: { _id: "$campo", total: { $sum: 1 } } }
]);
```

### Calculando Estatísticas com $group

```javascript
db.vendas.aggregate([
    { $group: { _id: "$produto", totalVendas: { $sum: "$quantidade" }, mediaPreco: { $avg: "$preco" } } }
]);
```

### Unwinding de Arrays

```javascript
db.usuarios.aggregate([
    { $unwind: "$interesses" },
    { $group: { _id: "$interesses", total: { $sum: 1 } } }
]);
```

---

## Considerações Finais

As agregações no MongoDB são poderosas ferramentas para análise de dados complexos e transformações avançadas. Ao utilizar a pipeline de agregação de forma eficiente, é possível obter insights valiosos e processar grandes volumes de dados de maneira eficiente.

Para mais detalhes sobre os estágios de agregação e operadores disponíveis, consulte a [Documentação Oficial do MongoDB sobre Agregações](https://docs.mongodb.com/manual/aggregation/).

---

Este README fornece uma introdução clara e prática sobre como utilizar as agregações no MongoDB para realizar operações avançadas de processamento e análise de dados.

