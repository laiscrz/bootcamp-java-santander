-- Adicionar colunas de endereço à tabela "Usuarios"
-- Coluna endereço -> multivalorada
ALTER TABLE Usuarios
ADD rua VARCHAR(100),  -- Adiciona coluna para armazenar o nome da rua
ADD numero VARCHAR(10),  -- Adiciona coluna para armazenar o número do endereço
ADD cidade VARCHAR(50),  -- Adiciona coluna para armazenar o nome da cidade
ADD estado VARCHAR(50);  -- Adiciona coluna para armazenar o nome do estado

-- Copia os dados da tabela original para a nova tabela
UPDATE usuarios
SET rua = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 1), ',', -1),  -- Extrai e atribui o nome da rua
    numero = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 2), ',', -1),  -- Extrai e atribui o número do endereço
    cidade = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 3), ',', -1),  -- Extrai e atribui o nome da cidade
    estado = SUBSTRING_INDEX(endereco, ',', -1);  -- Extrai e atribui o nome do estado

-- Exclusão da coluna "endereco" da tabela original
ALTER TABLE usuarios
DROP COLUMN endereco;
