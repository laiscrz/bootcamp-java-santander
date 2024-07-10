/* COMANDO --> CREATE TABLE */
-- Criando tabelas com suas rescpectivas colunas

-- Tabela de usuários
CREATE TABLE usuarios (
  id INT, -- Identificador único do usuário
  nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário', -- Nome do usuário (obrigatório)
  email VARCHAR(255) NOT NULL UNIQUE COMMENT 'Endereço de e-mail do usuário', -- Endereço de e-mail do usuário (obrigatório e único)
  data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuário', -- Data de nascimento do usuário (obrigatória)
  endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do Cliente' -- Endereço do usuário (obrigatório)
);

-- Tabela de destinos de viagens
CREATE TABLE viagens.destinos (
  id INT, -- Identificador único do destino
  nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino', -- Nome do destino (obrigatório e único)
  descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino' -- Descrição do destino (obrigatória)
);

-- Tabela de reservas de viagens
CREATE TABLE viagens.reservas (
  id INT COMMENT 'Identificador único da reserva', -- Identificador único da reserva
  id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva', -- Referência ao ID do usuário que fez a reserva
  id_destino INT COMMENT 'Referência ao ID do destino da reserva', -- Referência ao ID do destino da reserva
  data DATE COMMENT 'Data da reserva', -- Data da reserva
  status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)' -- Status da reserva (padrão: pendente)
);
