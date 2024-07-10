# Consultas Avançadas 🔍

> Trabalhando com consultas avançadas: junções, subconsultas, funções agregadas e agrupamento de resultados.

## Junções (Joins)

As junções são usadas para combinar dados de duas ou mais tabelas com base em uma condição relacionada.

### Tipos de Junções

1. **INNER JOIN**: Retorna registros que têm valores correspondentes em ambas as tabelas.
   
2. **LEFT JOIN** (ou LEFT OUTER JOIN): Retorna todos os registros da tabela da esquerda (A) e os registros correspondentes da tabela da direita (B). Os resultados serão NULL do lado direito quando não houver correspondência.
   
3. **RIGHT JOIN** (ou RIGHT OUTER JOIN): Retorna todos os registros da tabela da direita (B) e os registros correspondentes da tabela da esquerda (A). Os resultados serão NULL do lado esquerdo quando não houver correspondência.
   
4. **FULL JOIN** (ou FULL OUTER JOIN): Retorna registros quando há uma correspondência em uma das tabelas. Isso significa que retorna todas as linhas de ambas as tabelas e preenche com NULLs onde não há correspondência.

### Exemplo

```sql
-- INNER JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
INNER JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;

-- LEFT JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
LEFT JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;

-- RIGHT JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
RIGHT JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;

-- FULL JOIN entre tabelas de clientes e pedidos
SELECT clientes.nome, pedidos.numero_pedido
FROM clientes
FULL JOIN pedidos ON clientes.cliente_id = pedidos.cliente_id;
```

## Subconsultas (Subqueries)

Subconsultas são consultas aninhadas dentro de outra consulta. Elas podem ser usadas em SELECT, INSERT, UPDATE ou DELETE, e geralmente são usadas para retornar dados que serão utilizados na consulta principal.

### Exemplo

```sql
-- Subconsulta em uma cláusula WHERE
SELECT nome
FROM clientes
WHERE cliente_id IN (SELECT cliente_id FROM pedidos WHERE valor_total > 1000);

-- Subconsulta em uma cláusula FROM
SELECT avg_salary
FROM (SELECT AVG(salario) AS avg_salary FROM empregados) AS avg_salario;
```

## Funções Agregadas

Funções agregadas realizam cálculos em um conjunto de valores e retornam um único valor.

### Principais Funções Agregadas

1. **COUNT()**: Retorna o número de registros.
2. **SUM()**: Retorna a soma dos valores.
3. **AVG()**: Retorna a média dos valores.
4. **MIN()**: Retorna o menor valor.
5. **MAX()**: Retorna o maior valor.

### Exemplo

```sql
-- Contagem do número de clientes
SELECT COUNT(cliente_id) FROM clientes;

-- Soma dos valores dos pedidos
SELECT SUM(valor_total) FROM pedidos;

-- Média dos salários dos empregados
SELECT AVG(salario) FROM empregados;

-- Menor e maior valor dos pedidos
SELECT MIN(valor_total) AS valor_minimo, MAX(valor_total) AS valor_maximo FROM pedidos;
```

## Agrupamento de Resultados

O agrupamento de resultados é feito utilizando a cláusula `GROUP BY`, que é usada para agrupar linhas que têm valores iguais em colunas especificadas em um único conjunto de resultados.

### Exemplo

```sql
-- Agrupando pedidos por cliente
SELECT cliente_id, COUNT(numero_pedido) AS total_pedidos
FROM pedidos
GROUP BY cliente_id;

-- Agrupando empregados por departamento e calculando a média salarial
SELECT departamento_id, AVG(salario) AS media_salarial
FROM empregados
GROUP BY departamento_id;
```

---

> Este README fornece uma visão geral das consultas avançadas em SQL, cobrindo junções, subconsultas, funções agregadas e agrupamento de resultados. Essas técnicas são essenciais para a manipulação e análise eficazes de dados em bancos de dados relacionais.
