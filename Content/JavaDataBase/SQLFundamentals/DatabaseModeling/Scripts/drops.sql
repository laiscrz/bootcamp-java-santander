/* DROP */
-- O comando DROP é usado para remover objetos de um banco de dados.

-- Criando nova tabela --
CREATE TABLE usuarios_nova (
  id INT,
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
  email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário',
  data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário',
  endereco VARCHAR(100) NOT NULL COMMENT 'Endereço do Cliente'
);

-- Migrando os dados --
INSERT INTO usuarios_nova
SELECT * FROM usuarios;

-- Excluindo tabela anterior --
DROP TABLE usuarios;
