# Pilares da Programação Orientada a Objeto em Java 🏛️

> ***Descrição:*** Exploração dos pilares fundamentais da POO: Abstração, Encapsulamento, Herança e Polimorfismo.

## 📚 Projetos e Assunto das Aulas
### Encapsulamento 🛡️

- **Conceito:** O encapsulamento em Java envolve o ocultamento dos detalhes de implementação de um objeto, protegendo seus atributos e expondo apenas métodos seguros para interação externa.

- **Projeto de Encapsulamento:**
  - Acesse projeto em: [EncapsulationPractice](EncapsulationPractice)
  - **Descrição:** Implementação de classes como Conta e Cliente, demonstrando o uso de atributos privados e métodos públicos para manipulação controlada dos dados.
  - **Diagrama UML:**
  ```mermaid
  classDiagram
    class Conta {
        - saldo: double
        - numeroConta: int

        + Conta(numeroContaInicial: int)
        + deposito(valor: double) void
        + saque(valor: double) void
        + getSaldo() double
    }

    class Cliente {
        - nome: String
        - email: String

        + Cliente(nome: String, email: String)
        + getNome() String
        + setNome(nome: String) void
        + getEmail() String
        + setEmail(email: String) void
    }

    class BancoMain {
       + main(String[] args) void
    }

    BancoMain *-- Conta
    BancoMain *-- Cliente
  ```


### Herança 🚗

- **Conceito:** Herança permite que uma classe (subclasse) herde características de outra classe (superclasse), promovendo a reutilização de código e estabelecendo uma hierarquia entre as classes.
  
- **Projeto de Herança:**
  - Acesse projeto em: [InheritancePractice](InheritancePractice)
  - **Descrição:** Implementação de classes como Veículo e Carro, exemplificando como atributos e métodos da superclasse são herdados e podem ser estendidos nas subclasses.
  - **Diagrama UML:**
  ```mermaid
  classDiagram
    class Veiculo {
        - marca: String
        - modelo: String

        + ligar() void
        + desligar() void
    }

    class Carro {
        - numeroDePortas: int

        + buzinar() void
    }

    class Moto {
        - cilindradas: int

        + acelerar() void
    }

    class ConcessionariaMain {
         + main(String[] args) void
    }

    Veiculo <|-- Carro
    Veiculo <|-- Moto
    ConcessionariaMain *-- Veiculo
  ```

### Abstração ✨

- **Conceito:** Abstração envolve a criação de classes abstratas que definem métodos (sem implementação) que devem ser sobrescritos nas subclasses, permitindo a definição de comportamentos genéricos.

- **Projeto de Abstração:**
  - Acesse projeto em: [AbstractionPractice](AbstractionPractice)
  - **Descrição:** Implementação de classes abstratas como Forma, com métodos abstratos calcularArea e calcularPerimetro, que são implementados nas subclasses Circle e Rectangle com lógicas específicas.
  - **Diagrama UML:**
  ```mermaid
  classDiagram
    class Forma {
        + calcularArea() double
        + calcularPerimetro() double
    }

    class Circulo {
        - raio: double

        + calcularArea() double
        + calcularPerimetro() double
    }

    class Retangulo {
        - ladoA: double
        - ladoB: double

        + calcularArea() double
        + calcularPerimetro() double
    }
  
    class GeometriaMain {
         + main(String[] args) void
    }

    Forma <|-- Circulo
    Forma <|-- Retangulo
    GeometriaMain *-- Circulo
    GeometriaMain *-- Retangulo
  ```

### Polimorfismo 🦄

- **Conceito:** Polimorfismo permite que objetos de diferentes classes respondam ao mesmo método de maneiras diferentes, sendo possível tratar objetos de subclasses da mesma forma que objetos da superclasse.

- **Projeto de Polimorfismo:**
  - Acesse projeto em: [PolymorphismPractice](PolymorphismPractice)
  - **Descrição:** Implementação de classes como Animal, com o método emitirSom, e suas subclasses Cachorro e Gato, demonstrando como objetos de diferentes subclasses podem ser tratados polimorficamente.
  - - **Diagrama UML:**
  ```mermaid
  classDiagram
    class Animal {
        + emitirSom(): void
    }

    class Cachorro {
        + emitirSom(): void
    }

    class Gato {
        + emitirSom(): void
    }

    class ZoologicoMain {
        + main(String[] args) void
    }

    Animal <|-- Cachorro
    Animal <|-- Gato
    ZoologicoMain *-- Animal
  ```

### Uso dos Pilares (aplicando em um projeto) 🌟

- **Sobre:** Projeto prático integrando os 4 pilares da POO (Abstração, Encapsulamento, Herança e Polimorfismo) em uma aplicação completa.
  
- **Link para o Projeto de Uso dos 4 Pilares:** [ConceptPillars](ConceptPillars)
- **Diagrama UML:**
  ```mermaid
  classDiagram
    class ServiceMessageInstant {
        + enviarMensagem() void
        + receberMensagem() void
        - validarConectadoInternet() void
        - salvarHistoricoMensagem() void
    }

    class MSNMessenger {
        + enviarMensagem() void
        + receberMensagem() void
    }

    class Telegram {
        + enviarMensagem() void
        + receberMensagem() void
    }

    class Facebook {
        + enviarMensagem() void
        + receberMensagem() void
    }

    class ComputerMain-Computer {
        + main(String[] args) void
    }

    ServiceMessageInstant <|-- MSNMessenger
    ServiceMessageInstant <|-- Telegram
    ServiceMessageInstant <|-- Facebook
    MSNMessenger ..> ServiceMessageInstant : usa
    Telegram ..> ServiceMessageInstant : usa
    Facebook ..> ServiceMessageInstant : usa
    ComputerMain-Computer *.. MSNMessenger : criação
    ComputerMain-Computer *.. Telegram : criação
    ComputerMain-Computer *.. Facebook : criação
  ```

### Interface 🖥️

- **Conceito:** Interfaces em Java permitem definir métodos que uma classe deve implementar, promovendo o contrato entre diferentes partes do código e facilitando a interoperabilidade.

- **Projeto de Interface:**
  - Acesse projeto em: [InterfacePractice](InterfacePractice)
  - **Descrição:** Implementação de interfaces que definem comportamentos comuns para classes relacionadas, demonstrando como classes diferentes podem implementar interfaces de maneiras distintas.
  - **Diagrama UML:**
  ```mermaid
  classDiagram
    class Copiadora {
        + copiar() void
    }
    class Digitalizadora {
        + digitalizar() void
    }
    class Impressora {
        + imprimir() void
    }
    class EquipamentoMultifuncional {
        + copiar() void
        + digitalizar() void
        + imprimir() void
    }

    class Fabrica {
       + main(String[] args) void
    }

    Copiadora <|.. Xerox
    Digitalizadora <|.. Scanner
    Impressora <|.. Deskjet
    Impressora <|.. Laserjet
    Copiadora <|.. EquipamentoMultifuncional
    Digitalizadora <|.. EquipamentoMultifuncional
    Impressora <|.. EquipamentoMultifuncional
    Fabrica *-- Copiadora
    Fabrica *-- Digitalizadora
    Fabrica *-- Impressora
    Fabrica *-- EquipamentoMultifuncional
  ```


--------------------------------
> Este README descreve os tópicos de Pilares de POO em Java abordados nas aulas do Bootcamp Santander da DIO, proporcionando um guia prático e teórico para quem está iniciando no aprendizado desta linguagem de programação.
