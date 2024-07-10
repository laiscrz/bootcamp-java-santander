/* Agrupamento de Resultados*/

-- Limit
-- GROUP BY
SELECT *, COUNT(*) AS total_reservas FROM reservas GROUP BY id_destino LIMIT 1 OFFSET 2;

SELECT *, COUNT(*) AS total_reservas FROM reservas GROUP BY id_destino LIMIT 1;

-- Ordenação
SELECT nome
FROM usuarios
ORDER BY nome;

SELECT nome, data_nascimento
FROM usuarios
ORDER BY data_nascimento, nome;

SELECT nome, data_nascimento
FROM usuarios
ORDER BY data_nascimento, nome DESC;
