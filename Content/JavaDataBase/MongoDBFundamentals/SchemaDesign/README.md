# MongoDB: Schema Design e Boas Práticas 📄✨

> **Descrição:** Explore o Schema Design no MongoDB e boas práticas para modelagem de dados eficiente. Compreenda a diferença entre JSON e BSON.

## Schema Design

No MongoDB, o Schema Design refere-se à maneira como você estrutura os dados dentro de documentos para atender às necessidades específicas da sua aplicação. É crucial para a performance, escalabilidade e facilidade de manutenção do seu banco de dados.

### Principais Considerações:

- **Modelagem de Dados Flexível**: MongoDB permite schemas flexíveis, onde documentos na mesma coleção podem ter estruturas diferentes. Isso permite adaptação conforme os requisitos mudam ao longo do tempo.

- **Embutir vs Referenciar**: Decidir entre incorporar documentos (embedding) ou referenciar documentos depende da natureza dos dados e dos padrões de acesso. Embedding é eficiente para relacionamentos um-para-um ou um-para-poucos, enquanto referenciamento é útil para relacionamentos muitos-para-muitos.

- **Indexação Estratégica**: Use índices para melhorar a performance de consultas. Considere os padrões de acesso aos dados ao decidir quais campos indexar.

- **Pensando em Escalabilidade**: Planeje para escalabilidade horizontal (sharding) desde o início, se prevê um grande volume de dados ou crescimento rápido.

## Boas Práticas

- **Consistência de Dados**: Use transações multi-documento (disponíveis no MongoDB 4.0+) para garantir a consistência ACID quando necessário.

- **Segurança**: Implemente autenticação e autorização robustas. Limite os privilégios de acesso aos documentos e coleções.

- **Monitoramento e Otimização**: Monitore o desempenho do MongoDB regularmente. Utilize ferramentas como o MongoDB Compass para análise e otimização de consultas.
---

## Schema Design vs. Referência

**Schema Design** no MongoDB refere-se à estruturação dos documentos dentro das coleções. Ele aborda como os dados são modelados e organizados para atender aos requisitos específicos da aplicação. Principais aspectos do Schema Design incluem:

- **Flexibilidade**: MongoDB permite schemas flexíveis, onde documentos na mesma coleção podem ter estruturas diferentes. Isso facilita adaptações conforme os requisitos evoluem.

- **Embutir vs. Referenciar**: Ao projetar o schema, uma decisão importante é entre incorporar documentos (embedding) ou referenciar documentos externos. 

  - **Embutir (Embedding)**: É a prática de incluir um documento dentro de outro documento. É eficiente para relacionamentos um-para-um ou um-para-poucos, evitando a necessidade de joins complexos.

    Exemplo:
    ```json
    {
      "_id": 1,
      "nome": "Maria",
      "endereco": {
        "rua": "Rua A",
        "cidade": "São Paulo",
        "estado": "SP"
      }
    }
    ```

  - **Referenciar (Referencing)**: Envolve armazenar referências a documentos externos através de chaves estrangeiras. É útil para relacionamentos muitos-para-muitos ou quando os documentos referenciados podem ser compartilhados entre múltiplos documentos.

    Exemplo:
    ```json
    {
      "_id": 1,
      "nome": "João",
      "endereco_id": 1001
    }
    ```

    Aqui, `"endereco_id"` é uma chave estrangeira que referencia um documento separado na coleção de endereços.

**Referência** no MongoDB é o conceito de relacionar documentos através de chaves estrangeiras (normalmente `_id`) para criar associações entre documentos. Isso permite gerenciar dados relacionados de forma eficiente, embora implique em operações adicionais (como joins) para recuperar dados completos.

### Resumo

- **Schema Design**: Define como os dados são estruturados dentro de documentos MongoDB para otimizar desempenho e flexibilidade.

- **Referência**: Estratégia para estabelecer relações entre documentos através de chaves estrangeiras, facilitando a integridade referencial e a gestão de dados complexos.

Ao escolher entre embedding e referencing, considere os padrões de acesso aos dados, a frequência de atualizações e as necessidades de consulta para garantir uma modelagem eficaz e escalável no MongoDB.

---

## Recomendações de Schema Design por Relacionamentos

Ao projetar o schema no MongoDB, considere estas recomendações para diferentes tipos de relacionamentos:

- **One-to-One**: Prefira atributos chave-valor no documento.
- **One-to-Few**: Prefira embedding (incorporação).
- **One-to-Many** e **Many-to-Many**: Prefira referência (referencing).

### Exemplos de Sintaxe

#### 1. One-to-One (Chave-Valor no Documento)

```json
// Exemplo de Schema para One-to-One
{
  "_id": 1,
  "nome": "Cliente A",
  "detalhes": {
    "email": "clienteA@example.com",
    "telefone": "(11) 98765-4321"
  }
}
```

#### 2. One-to-Few (Embedding)

```json
// Exemplo de Schema para One-to-Few (Embedding)
{
  "_id": 1,
  "nome": "Departamento A",
  "funcionarios": [
    { "nome": "João", "cargo": "Analista" },
    { "nome": "Maria", "cargo": "Desenvolvedor" }
  ]
}
```

#### 3. One-to-Many/ Many-to-many (Referência)

```json
// Exemplo de Schema para One-to-Many (Referência)
// Coleção de Posts
{
  "_id": 1,
  "titulo": "Post A",
  "conteudo": "Conteúdo do Post A"
}

// Coleção de Comentários referenciando o Post
{
  "_id": 101,
  "post_id": 1,
  "autor": "Usuário A",
  "comentario": "Comentário no Post A"
}
```

Essas recomendações ajudam a modelar dados de maneira eficiente e adaptável no MongoDB, aproveitando ao máximo as capacidades do banco de dados NoSQL para diferentes tipos de relacionamentos.

---

## Diferença entre JSON e BSON

| **JSON (JavaScript Object Notation)**                  | **BSON (Binary JSON)**                                     |
|-------------------------------------------------------|------------------------------------------------------------|
| Formato de texto simples, usado para troca de dados   | Formato binário derivado do JSON, otimizado para armazenar |
| Leve e legível por humanos                           | e recuperar dados em bancos de dados                         |
| Suporta tipos de dados básicos (número, string, etc.) | Suporta tipos de dados adicionais (BinData, ObjectId, etc.)  |
| Exemplo: `{ "nome": "Maria", "idade": 30 }`            | Exemplo: `BinData(0, "YmFzZTY0IGVuY29kaW5n")`               |

---

## Tipos de Dados - MongoDB
Para explorar os tipos de dados no MongoDB, podemos listar os principais tipos suportados pelo banco de dados. Abaixo está uma tabela explicativa dos tipos de dados comuns no MongoDB:

| Tipo de Dado     | Descrição                                                                                                                                                     | Exemplo                  |
|------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------|
| **String**       | Sequência de caracteres Unicode.                                                                                                                               | `"Exemplo"`              |
| **Integer**      | Números inteiros de 32 ou 64 bits.                                                                                                                             | `123`                    |
| **Double**       | Números de ponto flutuante de 64 bits.                                                                                                                         | `123.45`                 |
| **Boolean**      | Valor booleano, pode ser `true` ou `false`.                                                                                                                    | `true`                   |
| **ObjectId**     | Identificador único de documento gerado automaticamente.                                                                                                       | `ObjectId("60eab8828d86c269e08f0b46")` |
| **Date**         | Armazena data e hora como um número de milissegundos desde a época Unix (1 de janeiro de 1970).                                                                | `ISODate("2024-07-11T12:00:00Z")` |
| **Array**        | Lista de valores que podem incluir tipos de dados diferentes ou documentos aninhados.                                                                         | `["valor1", "valor2"]`   |
| **Object**       | Documento embutido ou subdocumento. Pode conter campos e valores aninhados.                                                                                    | `{"campo": "valor"}`     |
| **Null**         | Valor nulo.                                                                                                                                                   | `null`                   |
| **Binary Data**  | Dados binários, como arquivos de imagem ou documentos.                                                                                                          | `BinData(0, "base64")`   |
| **Timestamp**    | Armazena um valor de data e hora específico.                                                                                                                   | `Timestamp(1234567890)` |
| **Regular Expression** | Expressão regular, usada para busca avançada.                                                                                                                | `/padrão/i`              |
| **MinKey**       | O valor mais baixo permitido para uma chave. Utilizado internamente para determinar ordenação em índices.                                                     | `MinKey`                 |
| **MaxKey**       | O valor mais alto permitido para uma chave. Utilizado internamente para determinar ordenação em índices.                                                      | `MaxKey`                 |

Esses tipos de dados são fundamentais para modelar dados de maneira flexível e eficiente no MongoDB. Cada tipo de dado oferece suporte a diferentes operações e comportamentos dentro do banco de dados, permitindo uma modelagem adaptável às necessidades da aplicação.

--- 

## Recursos Adicionais

- **Documentação do MongoDB**: Explore mais sobre Schema Design, boas práticas e mais na documentação oficial do MongoDB.
  - [Documentação do MongoDB](https://docs.mongodb.com/)

---

> Este README oferece uma introdução ao Schema Design e boas práticas no MongoDB, explicando a diferença entre JSON e BSON. Compreender e aplicar esses conceitos é essencial para utilizar eficientemente o MongoDB em suas aplicações, garantindo desempenho, escalabilidade e segurança adequados.
