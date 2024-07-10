# Normalização em Bancos de Dados Relacionais 📏

A normalização em bancos de dados é o processo de organizar os dados em uma estrutura que minimize a redundância e a dependência, garantindo integridade e eficiência. Isso é alcançado dividindo as tabelas em conjuntos menores e mais coesos, reduzindo assim a duplicação de dados e melhorando a eficiência das consultas.

## Conceitos Fundamentais

### Formas Normais

As formas normais são diretrizes que definem o grau de organização e dependência dos dados em um banco de dados. As principais formas normais incluem:

1. **Primeira Forma Normal (1FN)**: Garante que cada coluna de uma tabela contenha apenas valores atômicos (indivisíveis) e que cada coluna tenha um nome único.

2. **Segunda Forma Normal (2FN)**: Além de atender à 1FN, cada coluna que não seja uma chave primária deve depender totalmente da chave primária.

3. **Terceira Forma Normal (3FN)**: Além de atender à 2FN, não deve haver dependências transitivas para colunas não chave. Em outras palavras, nenhum atributo não chave deve depender de outro atributo não chave.

### Benefícios da Normalização

- **Redução de Redundância**: Evita a duplicação desnecessária de dados.
- **Melhoria na Consistência**: Reduz inconsistências nos dados.
- **Melhoria na Performance**: Facilita consultas eficientes.

## Exemplos Práticos

### Exemplo de Tabela Não Normalizada

Considere uma tabela de pedidos onde cada pedido contém informações do cliente:

| PedidoID | ClienteID | NomeCliente | EnderecoCliente | ProdutoID | NomeProduto | PrecoUnitario | Quantidade |
|----------|-----------|-------------|-----------------|-----------|-------------|---------------|------------|
| 1        | 101       | João        | Rua A, 123      | 1         | Camiseta    | 29.99         | 2          |
| 2        | 102       | Maria       | Av. B, 456      | 2         | Calça       | 49.99         | 1          |

Nesta tabela, informações do cliente e produto são repetidas em cada linha de pedido.

### Aplicando a Primeira Forma Normal (1FN)

Para aplicar a 1FN, dividimos a tabela em entidades mais pequenas, cada uma com informações atômicas:

#### Tabela de Pedidos

| PedidoID | ClienteID | ProdutoID | Quantidade |
|----------|-----------|-----------|------------|
| 1        | 101       | 1         | 2          |
| 2        | 102       | 2         | 1          |

#### Tabela de Clientes

| ClienteID | Nome       | Endereco     |
|-----------|------------|--------------|
| 101       | João       | Rua A, 123   |
| 102       | Maria      | Av. B, 456   |

#### Tabela de Produtos

| ProdutoID | Nome       | PrecoUnitario |
|-----------|------------|---------------|
| 1         | Camiseta   | 29.99         |
| 2         | Calça      | 49.99         |

### Aplicando a Segunda Forma Normal (2FN)

Na 2FN, verificamos a dependência total das colunas em relação à chave primária:

#### Tabela de Pedidos

| PedidoID | ClienteID | ProdutoID | Quantidade |
|----------|-----------|-----------|------------|
| 1        | 101       | 1         | 2          |
| 2        | 102       | 2         | 1          |

#### Tabela de Itens de Pedido

| PedidoID | ProdutoID | Quantidade |
|----------|-----------|------------|
| 1        | 1         | 2          |
| 2        | 2         | 1          |

### Aplicando a Terceira Forma Normal (3FN)

Na 3FN, removemos dependências transitivas que não se aplicam diretamente à chave primária:

#### Tabela de Clientes

| ClienteID | Nome       | Endereco     |
|-----------|------------|--------------|
| 101       | João       | Rua A, 123   |
| 102       | Maria      | Av. B, 456   |

#### Tabela de Produtos

| ProdutoID | Nome       | PrecoUnitario |
|-----------|------------|---------------|
| 1         | Camiseta   | 29.99         |
| 2         | Calça      | 49.99         |

#### Tabela de Pedidos

| PedidoID | ClienteID |
|----------|-----------|
| 1        | 101       |
| 2        | 102       |

#### Tabela de Itens de Pedido

| PedidoID | ProdutoID | Quantidade |
|----------|-----------|------------|
| 1        | 1         | 2          |
| 2        | 2         | 1          |

---

> Este README fornece uma introdução básica aos conceitos de normalização em bancos de dados relacionais, destacando as formas normais e apresentando exemplos práticos de como aplicá-las para melhorar a estrutura e a eficiência dos dados em um sistema de banco de dados.
