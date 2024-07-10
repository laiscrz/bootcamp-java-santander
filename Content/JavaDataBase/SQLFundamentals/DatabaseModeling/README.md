# Modelagem de Banco de Dados 🏗️

> Prática de modelagem de banco de dados: operações CRUD, chaves primárias e estrangeiras, alteração e exclusão de tabelas e registros.

## Comandos SQL

### Comando SQL: CREATE TABLE

#### Opções
- Restrições de Valor
  - Not Null
  - UNIQUE
  - DEFAULT
- Chaves primárias e estrangeiras
- Auto Incremento

Exemplo de sintaxe para criar uma tabela com chave primária:
```sql
CREATE TABLE Cliente (
    id INT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE
);
```
--

### Tipos de Dados
Veja Abaixo:

| Tipo de Dado | Descrição | SQL (nome do código) |
|--------------|-----------|----------------------|
| Inteiro      | Números inteiros, positivos ou negativos. | INT |
| Decimal/Numerico | Números decimais, com precisão configurável. | DECIMAL(precision, scale) ou NUMERIC(precision, scale) |
| Caractere/Varchar | Cadeias de caracteres variáveis de comprimento limitado. | VARCHAR(max_length) |
| Data/Hora    | Data e/ou hora, incluindo data, hora ou ambos. | DATE, TIME, DATETIME |
| Booleano     | Valores lógicos verdadeiro (true) ou falso (false). | BOOLEAN |
| Texto longo  | Texto extenso, usado para armazenar grandes quantidades de dados de texto. | TEXT |

--

### Comando SQL: INSERT

O comando `INSERT` é usado para adicionar novos registros a uma tabela existente em um banco de dados. Ele permite inserir valores específicos nas colunas de uma tabela.

#### Sintaxe do INSERT

A sintaxe básica do comando `INSERT` é a seguinte:

```sql
INSERT INTO nome_da_tabela (coluna1, coluna2, ...)
VALUES (valor1, valor2, ...);
```

#### Exemplo de Utilização

Vamos usar o exemplo da tabela `Cliente` para demonstrar como inserir um novo registro:

Suponha que a tabela `Cliente` tenha as colunas `id`, `nome` e `email`. Aqui está como você poderia inserir um novo cliente:

```sql
INSERT INTO Cliente (id, nome, email)
VALUES (1, 'João Silva', 'joao@example.com');
```

Neste exemplo:
- `Cliente` é o nome da tabela onde os dados serão inseridos.
- `id`, `nome` e `email` são as colunas onde os dados serão inseridos.
- `1`, `'João Silva'` e `'joao@example.com'` são os valores que estão sendo inseridos para as respectivas colunas.

---

### Comando SQL: SELECT

O comando `SELECT` é fundamental para consultas em bancos de dados relacionais. Ele permite selecionar dados de uma tabela ou mais tabelas com base em critérios específicos.

#### Sintaxe Básica do SELECT

A sintaxe básica do comando `SELECT` é a seguinte:

```sql
SELECT coluna1, coluna2, ...
FROM nome_da_tabela;
```

- `coluna1, coluna2, ...`: São as colunas específicas que você deseja recuperar da tabela. Use `*` para selecionar todas as colunas.
- `nome_da_tabela`: É o nome da tabela da qual você deseja selecionar os dados.

#### Exemplo de Utilização Simples

Vamos usar a tabela `Cliente` como exemplo para selecionar todos os registros:

```sql
SELECT * FROM Cliente;
```

Este comando seleciona todas as colunas (`*`) da tabela `Cliente`, retornando todos os registros armazenados nela.

#### Selecionando Colunas Específicas

Para selecionar apenas algumas colunas específicas, liste-as separadas por vírgulas:

```sql
SELECT nome, email FROM Cliente;
```

Neste exemplo, apenas as colunas `nome` e `email` da tabela `Cliente` serão retornadas na consulta.

#### Uso do LIKE para Filtrar Resultados

O operador `LIKE` é usado para filtrar registros baseados em padrões de texto. Ele é útil para encontrar registros que correspondam a um padrão específico em uma coluna de texto:

```sql
SELECT * FROM Cliente WHERE nome LIKE 'João%';
```

Esta consulta retornará todos os clientes cujo nome começa com "João".

#### Ordenando Resultados com ORDER BY

Para ordenar os resultados em ordem ascendente ou descendente, use a cláusula `ORDER BY` seguida pelo nome da coluna de ordenação e opcionalmente por `ASC` (ascendente) ou `DESC` (descendente):

```sql
SELECT * FROM Cliente ORDER BY nome ASC;
```

---

## UPDATE

## DELETE

## ALTER 

## DROP

## Chaves Primárias (PRIMARY KEY) 🔑

Exemplo de sintaxe para definir uma chave primária:
```sql
CREATE TABLE Pedido (
    id INT PRIMARY KEY,
    cliente_id INT,
    valor DECIMAL(10, 2),
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);
```

## Chaves Estrangeiras (FOREIGN KEY) 🔗

Exemplo de sintaxe para definir uma chave estrangeira:
```sql
CREATE TABLE ItemPedido (
    id INT PRIMARY KEY,
    pedido_id INT,
    produto_id INT,
    quantidade INT,
    FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
    FOREIGN KEY (produto_id) REFERENCES Produto(id)
);
```

---

