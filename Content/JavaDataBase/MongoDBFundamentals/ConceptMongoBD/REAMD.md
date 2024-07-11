# Conceitos Básicos de MongoDB 📄

> Descrição: Introdução aos conceitos fundamentais do MongoDB, um banco de dados NoSQL orientado a documentos.

## Introdução ao MongoDB 📄

O MongoDB é um banco de dados NoSQL, open-source e orientado a documentos, desenvolvido para escalabilidade e alta performance. Ele armazena dados em documentos no formato BSON (Binary JSON), o que facilita o armazenamento e a manipulação de dados estruturados e semiestruturados.

### Documento

Um documento no MongoDB é uma unidade básica de armazenamento, equivalente a uma tupla em bancos de dados relacionais. Ele é estruturado em formato BSON (Binary JSON) e pode conter dados complexos e aninhados.

### Coleção

Uma coleção no MongoDB é um grupo de documentos semelhante a uma tabela em bancos de dados relacionais. Ao contrário das tabelas, os documentos dentro de uma coleção não precisam ter a mesma estrutura, oferecendo flexibilidade na modelagem de dados.

### Incorporação (Embedding) / Referenciamento (Linking)

- **Incorporação (Embedding)**: É a prática de incluir um documento dentro de outro documento. Isso permite representar relacionamentos entre dados de forma hierárquica e é análogo a JOINs em bancos de dados relacionais.

- **Referenciamento (Linking)**: Envolve a criação de referências entre documentos usando IDs ou chaves. É útil quando há necessidade de manter os documentos independentes ou quando se quer evitar a duplicação de dados.

## Quando Usar o MongoDB:

- **Grande Volume de Dados**: MongoDB é eficiente para lidar com grandes volumes de dados e cargas de trabalho distribuídas.
  
- **Dados Não Necessariamente Estruturados**: Útil quando a estrutura dos dados pode variar ou não é definida previamente.

## Quando NÃO Usar o MongoDB:

- **Necessidade de Relacionamentos/Joins**: MongoDB não suporta JOINs complexos entre coleções. Se a aplicação necessita de relacionamentos fortes entre entidades, um banco de dados relacional pode ser mais apropriado.

- **Propriedades ACID e Transações são Importantes**: Bancos de dados relacionais são melhores para aplicações que requerem transações ACID (Atomicidade, Consistência, Isolamento, Durabilidade) robustas.

---

### Recursos Adicionais

- **Documentação do MongoDB**: Acesse a documentação oficial do MongoDB para mais detalhes e guias de uso.
  - [Documentação do MongoDB](https://docs.mongodb.com/)
  
- **MongoDB Online**: Experimente o MongoDB diretamente no navegador com o MongoDB Atlas, a versão hospedada e gerenciada do MongoDB.
  - [MongoDB Atlas](https://www.mongodb.com/cloud/atlas)

- **Usando MongoDB via Docker**: Para desenvolvimento local, você pode usar o Docker para instalar e executar o MongoDB rapidamente.
  - [Instalação do MongoDB via Docker](https://hub.docker.com/_/mongo)

---

> Este README fornece uma visão geral dos conceitos básicos do MongoDB, incluindo documentos, coleções, incorporação/referenciamento, e orientações sobre quando usar ou não usar MongoDB em aplicações. Compreender esses fundamentos é essencial para decidir a melhor tecnologia de banco de dados para diferentes tipos de projetos.
