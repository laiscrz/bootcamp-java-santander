# Conhecendo Collections 🗃️

> **Descrição:** Estudo das principais interfaces e classes do framework Collections, como List, Set e Map.

## 📚 Projetos e Assunto das Aulas

### Conceito de Generics
- Estudo do conceito de generics em Java.
- Acesse o projeto: [GenericsType](GenericsType)

### Comparable e Comparator
- Comparação e diferenciação entre as interfaces Comparable e Comparator.
- Acesse o projeto: [InterfacesComparableComparator](InterfacesComparableComparator)

### Interfaces List
- Estudo da interface List e suas implementações.
- Acesse o projeto: [InterfacesList](InterfacesList)

### Interfaces Set
- Estudo da interface Set e suas implementações.
- Acesse o projeto: [InterfacesSet](InterfacesSet)

### Interfaces Map
- Estudo da interface Map e suas implementações.
- Acesse o projeto: [InterfacesMap](InterfacesMap)

### Diferenças entre List, Set e Map

| Característica      | List                            | Set                             | Map                             |
|---------------------|---------------------------------|---------------------------------|---------------------------------|
| **Ordenação**       | Mantém a ordem de inserção      | Sem garantia de ordem          | Sem garantia de ordem          |
| **Elementos Únicos**| Pode conter elementos duplicados| Contém apenas elementos únicos | Chave única, valores podem ser duplicados |
| **Acesso**          | Acesso por índice               | Acesso direto através de elementos | Acesso por chave               |
| **Implementações**  | ArrayList, LinkedList, etc.     | HashSet, TreeSet, etc.         | HashMap, TreeMap, etc.         |
| **Exemplo**         | `[1, 2, 3]`                     | `{1, 2, 3}`                    | `{ "chave1" -> "valor1", "chave2" -> "valor2" }` |
