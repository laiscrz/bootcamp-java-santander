# Bancos de Dados Chave-Valor 🔑🗂️

> **Descrição:** Visão detalhada sobre bancos de dados chave-valor, suas características, casos de uso e exemplos práticos de sintaxe.

## 📚 Conteúdo

1. [Introdução aos Bancos de Dados Chave-Valor](#introdução-aos-bancos-de-dados-chave-valor)
2. [Características](#características)
3. [Casos de Uso](#casos-de-uso)
4. [Operações CRUD e Inserção de Dados](#operações-crud-e-inserção-de-dados)
   - [Redis](#redis)
   - [Amazon DynamoDB](#amazon-dynamodb)

## Introdução aos Bancos de Dados Chave-Valor 🔑🗂️

Bancos de dados chave-valor são uma categoria de banco de dados NoSQL onde cada item é armazenado como um par chave-valor. Este modelo é extremamente eficiente para operações simples de armazenamento e recuperação de dados, oferecendo alta performance e escalabilidade.

## Características

- **Simplicidade**: Estrutura de dados simples com pares chave-valor.
- **Alta Performance**: Ideal para operações de leitura e escrita rápidas.
- **Escalabilidade Horizontal**: Facilmente escalável, adequado para grandes volumes de dados.

## Casos de Uso

- **Cache de Sessão**: Armazenar dados temporários para sessões de usuários.
- **Armazenamento de Configurações**: Guardar configurações de aplicativos e preferências de usuários.
- **Filas de Mensagens**: Utilizado em sistemas de filas para processamento de mensagens.

## Operações CRUD e Inserção de Dados

As operações CRUD são fundamentais para qualquer banco de dados, representando as ações de **C**reate (criar), **R**ead (ler), **U**pdate (atualizar) e **D**elete (deletar). Abaixo, mostramos como realizar essas operações nos bancos de dados Redis e Amazon DynamoDB.

### Redis

#### Conexão com o Redis

```bash
redis-cli
```

#### Inserção de Dados

```bash
SET user:1 "João Silva"
```

#### Leitura de Dados

```bash
GET user:1
```

#### Atualização de Dados

```bash
SET user:1 "João Pedro Silva"
```

#### Deleção de Dados

```bash
DEL user:1
```

### Amazon DynamoDB

#### Criação de uma Tabela

```js
aws dynamodb create-table \
    --table-name Usuarios \
    --attribute-definitions \
        AttributeName=UserId,AttributeType=S \
    --key-schema \
        AttributeName=UserId,KeyType=HASH \
    --provisioned-throughput \
        ReadCapacityUnits=5,WriteCapacityUnits=5
```

#### Inserção de Dados

```js
aws dynamodb put-item \
    --table-name Usuarios \
    --item '{
        "UserId": {"S": "1"},
        "Nome": {"S": "João Silva"},
        "Email": {"S": "joao.silva@example.com"}
    }'
```

#### Leitura de Dados

```js
aws dynamodb get-item \
    --table-name Usuarios \
    --key '{
        "UserId": {"S": "1"}
    }'
```

#### Atualização de Dados

```js
aws dynamodb update-item \
    --table-name Usuarios \
    --key '{
        "UserId": {"S": "1"}
    }' \
    --update-expression "SET Nome = :nome" \
    --expression-attribute-values '{
        ":nome": {"S": "João Pedro Silva"}
    }'
```

#### Deleção de Dados

```js
aws dynamodb delete-item \
    --table-name Usuarios \
    --key '{
        "UserId": {"S": "1"}
    }'
```

---

> Este README fornece uma visão abrangente dos bancos de dados chave-valor, destacando suas características, casos de uso e exemplos práticos com Redis e Amazon DynamoDB. Compreender a simplicidade e eficiência dos bancos de dados chave-valor pode ajudar a otimizar a performance de suas operações de armazenamento e recuperação de dados.
