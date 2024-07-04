# Projeto  Abstraindo Bootcamp - Programação Orientada a Objetos (POO) 📕

> Este desafio tem como objetivo exercitar o conteúdo de Programação Orientada a Objetos (POO) utilizando Java, através da implementação de um uma simulação de um bootcamp.

## Objetivo 🎯
1. **Criação do Projeto em Java (`BootcampPOO`):**
   - Implementar os pilares da POO: Abstração, Encapsulamento, Herança e Polimorfismo.
   - Desenvolver classes que representem entidades do banco como Conta, Cliente e Transação.
   - Utilizar interfaces onde aplicável para definir comportamentos comuns.

2. **Funcionalidades Esperadas:**
   - Bootcamp: Classe principal que coordena as funcionalidades do bootcamp.
   - Curso: Representação de cursos oferecidos no bootcamp.
   - Conteudo (abstract): Classe abstrata para representar conteúdos educacionais.
   - Dev: Representação de desenvolvedores que participam do bootcamp.

## Diagrama UML 🖼️

```mermaid
classDiagram
    class Bootcamp {
        - nome: String
        - descricao: String
        - dataInicial: LocalDate
        - dataFinal: LocalDate
        - devsInscritos: Set<Dev>
        - conteudos: Set<Conteudo>
        + getNome(): String
        + setNome(nome: String): void
        + getDescricao(): String
        + setDescricao(descricao: String): void
        + getDataInicial(): LocalDate
        + getDataFinal(): LocalDate
        + getDevsInscritos(): Set<Dev>
        + setDevsInscritos(devsInscritos: Set<Dev>): void
        + getConteudos(): Set<Conteudo>
        + setConteudos(conteudos: Set<Conteudo>): void
        + adicionarDev(dev: Dev): void
        + removerDev(dev: Dev): void
        + listarDevsInscritos(): Set<Dev>
        + adicionarConteudo(conteudo: Conteudo): void
        + removerConteudo(conteudo: Conteudo): void
        + listarConteudos(): Set<Conteudo>
    }
    class Conteudo {
        - titulo: String
        - descricao: String
        + getTitulo(): String
        + setTitulo(titulo: String): void
        + getDescricao(): String
        + setDescricao(descricao: String): void
    }
    class Dev {
        - nome: String
        - conteudosInscritos: Set<Conteudo>
        - conteudosConcluidos: Set<Conteudo>
        + getNome(): String
        + inscreverBootcamp(bootcamp: Bootcamp): void
        + progredir(): void
        + calcularTotalXp(): double
        + getConteudosInscritos(): Set<Conteudo>
        + setConteudosInscritos(conteudosInscritos: Set<Conteudo>): void
        + getConteudosConcluidos(): Set<Conteudo>
        + setConteudosConcluidos(conteudosConcluidos: Set<Conteudo>): void
    }
    class Curso {
        - cargaHoraria: int
        + getCargaHoraria(): int
        + setCargaHoraria(cargaHoraria: int): void
    }
    class Instrutor {
        - conteudosMinistrados: Set<Conteudo>
        + getConteudosMinistrados(): Set<Conteudo>
        + adicionarConteudoMinistrado(conteudo: Conteudo): void
        + removerConteudoMinistrado(conteudo: Conteudo): void
    }
    class Mentoria {
        - data: LocalDate
        + getData(): LocalDate
        + setData(data: LocalDate): void
    }
    class Certificado {
        - dev: Dev
        - curso: Curso
        - dataConclusao: LocalDate
        + getDev(): Dev
        + setDev(dev: Dev): void
        + getCurso(): Curso
        + setCurso(curso: Curso): void
        + getDataConclusao(): LocalDate
        + setDataConclusao(dataConclusao: LocalDate): void
        + isCertificadoValido(): boolean
        + obterDetalhesCertificado(): String
    }
    class Usuario {
        - nome: String
        + getNome(): String
        + setNome(nome: String): void
    }
    
    Bootcamp "1" *-- "*" Dev : possui
    Bootcamp "1" *-- "*" Conteudo : oferece
    Dev "*" -- "1" Conteudo : inscreve
    Conteudo <|-- Curso
    Conteudo <|-- Mentoria
    Usuario <|-- Dev
    Usuario <|-- Instrutor
    Instrutor "1" *-- "*" Conteudo : ministra
    Dev "1" *-- "0..*" Certificado : possui
```
