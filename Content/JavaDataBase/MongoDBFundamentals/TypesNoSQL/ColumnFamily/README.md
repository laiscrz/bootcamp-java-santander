# Bancos de Dados - NoSQL de Familia de Colunas 📊

> **Descrição:** Visão detalhada sobre bancos de dados de colunas, suas características, casos de uso e exemplos práticos de sintaxe.

## 📚 Conteúdo

1. [Introdução aos Bancos de Dados de Colunas](#introdução-aos-bancos-de-dados-de-colunas-)
2. [Características](#características)
3. [Casos de Uso](#casos-de-uso)
4. [Operações CRUD e Inserção de Dados](#operações-crud-e-inserção-de-dados)
   - [Apache Cassandra](#apache-cassandra)
   - [HBase](#hbase)

## Introdução aos Bancos de Dados de Colunas 📊

Bancos de dados de colunas armazenam dados em colunas em vez de linhas, como em bancos de dados relacionais tradicionais. Esse formato é altamente eficiente para consultas de leitura intensiva e análises de grandes volumes de dados.

## Características

- **Alta Performance em Consultas**: Especialmente para leitura e análise de grandes conjuntos de dados.
- **Escalabilidade Horizontal**: Facilmente escalável para lidar com grandes volumes de dados distribuídos.
- **Armazenamento Eficiente**: Armazena dados de forma compacta, reduzindo a redundância.

## Casos de Uso

- **Análise de Dados**: Ideal para análises de big data e operações OLAP (Processamento Analítico Online).
- **Armazenamento de Dados Históricos**: Manter grandes volumes de dados históricos para análises e relatórios.
- **Sistemas de Recomendação**: Utilizado para armazenar e analisar grandes quantidades de dados de usuários e produtos.

## Operações CRUD e Inserção de Dados

As operações CRUD são fundamentais para qualquer banco de dados, representando as ações de **C**reate (criar), **R**ead (ler), **U**pdate (atualizar) e **D**elete (deletar). Abaixo, mostramos como realizar essas operações nos bancos de dados Apache Cassandra e HBase.

### Apache Cassandra

Apache Cassandra é um banco de dados de colunas distribuído, conhecido por sua escalabilidade e alta disponibilidade sem um ponto único de falha.

#### Criação de um Keyspace

```sql
CREATE KEYSPACE exemplo
WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };
```

#### Criação de uma Tabela

```sql
CREATE TABLE exemplo.usuarios (
    id UUID PRIMARY KEY,
    nome TEXT,
    email TEXT,
    idade INT
);
```

#### Inserção de Dados

```sql
INSERT INTO exemplo.usuarios (id, nome, email, idade)
VALUES (uuid(), 'João Silva', 'joao.silva@example.com', 30);
```

#### Leitura de Dados

```sql
SELECT * FROM exemplo.usuarios WHERE id = some-uuid;
```

#### Atualização de Dados

```sql
UPDATE exemplo.usuarios
SET email = 'joao.novoemail@example.com'
WHERE id = some-uuid;
```

#### Deleção de Dados

```sql
DELETE FROM exemplo.usuarios WHERE id = some-uuid;
```

### HBase

HBase é um banco de dados de colunas baseado no Hadoop, projetado para armazenar e processar grandes quantidades de dados em tabelas distribuídas.

#### Criação de uma Tabela

```bash
create 'usuarios', 'informacao_pessoal'
```

#### Inserção de Dados

```bash
put 'usuarios', 'user1', 'informacao_pessoal:nome', 'João Silva'
put 'usuarios', 'user1', 'informacao_pessoal:email', 'joao.silva@example.com'
```

#### Leitura de Dados

```bash
get 'usuarios', 'user1'
```

#### Atualização de Dados

```bash
put 'usuarios', 'user1', 'informacao_pessoal:email', 'joao.novoemail@example.com'
```

#### Deleção de Dados

```bash
delete 'usuarios', 'user1', 'informacao_pessoal:email'
```

---

> Este README fornece uma visão abrangente dos bancos de dados de colunas, destacando suas características, casos de uso e exemplos práticos com Apache Cassandra e HBase. Compreender a eficiência e a escalabilidade dos bancos de dados de colunas pode ajudar a otimizar a performance de suas análises de big data e armazenamento de dados históricos.
