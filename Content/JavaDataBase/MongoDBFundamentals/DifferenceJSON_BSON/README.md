# JSON vs BSON: Diferenças e Uso no MongoDB 📄🔍

> Aprofundando sobre: Diferenças e Uso dos dois.

### JSON (JavaScript Object Notation)

- **Formato**: JSON é um formato de texto simples usado para troca de dados.
- **Legibilidade**: Leve e legível por humanos.
- **Tipos de Dados**: Suporta tipos básicos como número, string, booleano, arrays e objetos.
- **Exemplo**:
  ```json
  {
    "nome": "Maria",
    "idade": 30,
    "cidade": "São Paulo"
  }
  ```
- **Uso**: É amplamente utilizado em APIs e comunicação entre sistemas web devido à sua simplicidade e legibilidade.

### BSON (Binary JSON)

- **Formato**: BSON é uma extensão binária do JSON, otimizada para armazenar e recuperar dados em bancos de dados.
- **Características**: 
  - Armazena tipos adicionais como BinData, ObjectId, Date, entre outros.
  - Estrutura de dados eficiente para armazenamento e consulta em bancos de dados.
- **Exemplo**:
  ```
  BinData(0, "YmFzZTY0IGVuY29kaW5n")
  ```
- **Uso**: 
  - MongoDB utiliza BSON como seu formato de armazenamento de dados. 
  - Oferece suporte a tipos de dados mais complexos e eficiência na manipulação de documentos grandes.

### Comparação Direta

| **JSON**                                 | **BSON**                                        |
|------------------------------------------|-------------------------------------------------|
| Formato de texto simples                  | Formato binário otimizado para banco de dados   |
| Leve e legível por humanos               | Eficiente para armazenamento e consulta         |
| Suporta tipos básicos (string, number)   | Suporta tipos adicionais (ObjectId, Date)       |
| Exemplo: `{ "nome": "Maria", "idade": 30 }` | Exemplo: `BinData(0, "YmFzZTY0IGVuY29kaW5n")` |

---

## Resumo

### Em tabela -> Diferença entre JSON e BSON

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

## Conclusão

JSON e BSON são formatos fundamentais para troca e armazenamento de dados, cada um com suas características e usos específicos. Enquanto JSON é ideal para comunicação entre sistemas e legibilidade humana, BSON é essencial para a eficiência e performance em bancos de dados, especialmente no MongoDB.

---

Espero que este guia tenha sido útil para entender melhor as diferenças entre JSON e BSON, e como eles são aplicados no contexto do MongoDB.
