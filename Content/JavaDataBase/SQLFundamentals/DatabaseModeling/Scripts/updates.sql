-- UPDATE

-- Atualiza todos os registros da tabela `usuarios` para definir o novo endereço como 'Nova Rua, 123' para todos os usuários
UPDATE usuarios SET endereco = 'Nova Rua, 123';

-- Atualiza o endereço apenas do usuário com email 'joao@example.com' para 'Nova Rua, 123'
UPDATE usuarios SET endereco = 'Nova Rua, 123' WHERE email = 'joao@example.com';
