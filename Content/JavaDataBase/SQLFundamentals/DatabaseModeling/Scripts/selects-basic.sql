-- SELECT
-- Consultas básicas nas tabelas.

-- Selecionar todos os registros da tabela "usuarios"
SELECT * FROM usuarios;

-- Selecionar apenas o nome e o email dos usuários
SELECT nome, email FROM usuarios;

-- Selecionar os usuários que possuem o nome "João Silva"
SELECT * FROM usuarios WHERE nome = 'João Silva';

-- Selecionar os usuários que nasceram antes de uma determinada data
SELECT * FROM usuarios WHERE data_nascimento < '1990-01-01';

-- Utilizando o operador LIKE para buscar usuários com "Silva" no nome
SELECT * FROM usuarios WHERE nome LIKE '%Silva%';

-- Utilizando o operador LIKE para buscar nomes que comecem com "Jo" e tenham um segundo caractere qualquer
SELECT * FROM usuarios WHERE nome LIKE 'Jo_o%';
