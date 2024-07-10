/* ALTER */
-- O comando ALTER é usado para fazer alterações em objetos existentes no banco de dados.

-- Criando uma nova tabela --
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

-- Renomeando a nova tabela para substituir a original --
ALTER TABLE usuarios_nova RENAME TO usuarios;

-- Alterando o tamanho da coluna endereço --
ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(150);

-- Exemplos adicionais de ALTER --

-- Adicionar uma nova coluna --
ALTER TABLE usuarios ADD COLUMN telefone VARCHAR(20);

-- Remover uma coluna --
ALTER TABLE usuarios DROP COLUMN data_nascimento;

-- Alterar o tipo de dados de uma coluna --
ALTER TABLE usuarios MODIFY COLUMN nome VARCHAR(150);

-- Adicionar uma restrição NOT NULL --
ALTER TABLE usuarios MODIFY COLUMN email VARCHAR(255) NOT NULL;

-- Renomear uma coluna --
ALTER TABLE usuarios CHANGE COLUMN endereco endereco_residencial VARCHAR(150);

