# Modelagem de Banco de Dados 🏗️

> Prática de modelagem de banco de dados: operações CRUD, chaves primárias e estrangeiras, alteração e exclusão de tabelas e registros.

## Comandos SQL

### CREATE TABLE

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

## Tipos de Dados
Veja Abaixo:

| Tipo de Dado | Descrição | SQL (nome do código) |
|--------------|-----------|----------------------|
| Inteiro      | Números inteiros, positivos ou negativos. | INT |
| Decimal/Numerico | Números decimais, com precisão configurável. | DECIMAL(precision, scale) ou NUMERIC(precision, scale) |
| Caractere/Varchar | Cadeias de caracteres variáveis de comprimento limitado. | VARCHAR(max_length) |
| Data/Hora    | Data e/ou hora, incluindo data, hora ou ambos. | DATE, TIME, DATETIME |
| Booleano     | Valores lógicos verdadeiro (true) ou falso (false). | BOOLEAN |
| Texto longo  | Texto extenso, usado para armazenar grandes quantidades de dados de texto. | TEXT |


## INSERT

## SELECT

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

