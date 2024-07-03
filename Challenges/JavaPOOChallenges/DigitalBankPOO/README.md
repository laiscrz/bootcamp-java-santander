# Projeto Banco Digital - Programação Orientada a Objetos (POO) 🏦💻

> Este desafio tem como objetivo exercitar o conteúdo de Programação Orientada a Objetos (POO) utilizando Java, através da implementação de um banco digital.

## Objetivo 🎯
1. **Criação do Projeto em Java (`DigitalBankingPOO`):**
   - Implementar os pilares da POO: Abstração, Encapsulamento, Herança e Polimorfismo.
   - Desenvolver classes que representem entidades do banco como Conta, Cliente e Transação.
   - Utilizar interfaces onde aplicável para definir comportamentos comuns.

2. **Funcionalidades Esperadas:**
   - Criação de contas para novos clientes.
   - Realização de depósitos, saques e transferências entre contas.
   - Possibilidade de visualização do saldo e extrato da conta.

## Diagrama UML 🖼️

```mermaid
classDiagram
    class Banco {
        - String nome
        - List<Conta> contas
        + Banco(String nome, List<Conta> contas)
        + String getNome()
        + void setNome(String nome)
        + List<Conta> getContas()
        + void setContas(List<Conta> contas)
    }

    class Cliente {
        - String nome
        + Cliente(String nome)
        + String getNome()
        + void setNome(String nome)
    }

    class ClienteFisico {
        - String cpf
        + ClienteFisico(String nome, String cpf)
        + String getCpf()
        + void setCpf(String cpf)
    }

    class ClienteJuridico {
        - String cnpj
        + ClienteJuridico(String nome, String cnpj)
        + String getCnpj()
        + void setCnpj(String cnpj)
    }

    class Conta {
         <<Abstract Class>>
        - int agencia
        - int numero
        - double saldo
        - Cliente cliente
        + Conta(Cliente cliente)
        + void sacar(double valor) throws SaldoInsuficienteException
        + void depositar(double valor)
        + void transferir(double valor, IConta contaDestino)
        + int getAgencia()
        + int getNumero()
        + double getSaldo()
        + Cliente getCliente()
         void abstract imprimirExtrato()
        + void imprimirInfosComuns()
    }

    class ContaCorrente {
        - static final double TAXA_DEBITO = 0.10
        + ContaCorrente(Cliente cliente)
        + void debitarTaxaDebito()
        + void imprimirExtrato()
    }

    class ContaPoupanca {
        - static final double TAXA_RENDIMENTO = 0.005
        + ContaPoupanca(Cliente cliente)
        + void calcularRendimento()
        + void imprimirExtrato()
    }

    class IConta {
         <<Interface>>
        + void sacar(double valor) throws SaldoInsuficienteException
        + void depositar(double valor)
        + void transferir(double valor, IConta contaDestino)
        + void imprimirExtrato()
    }

    class SaldoInsuficienteException {
        + SaldoInsuficienteException()
        + SaldoInsuficienteException(String message)
    }

    class Main {
        <<Application>>
        + void main(String[] args)
        + void exibirMenu()
        + void criarConta(Scanner scanner, List<Conta> contas)
        + void realizarOperacoes(Scanner scanner, Banco banco)
        + void exibirMenuOperacoes()
        + void realizarDeposito(Scanner scanner, Conta conta)
        + void realizarSaque(Scanner scanner, Conta conta)
        + void realizarTransferencia(Scanner scanner, Conta contaOrigem, Banco banco)
        + void consultarSaldo(Conta conta)
        + void imprimirExtrato(Conta conta)
    }

    Banco -- Conta : contains
    Cliente <|-- ClienteFisico
    Cliente <|-- ClienteJuridico
    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Conta ..|> IConta
    Main *--> Banco
    Main *--> Cliente
    Main *--> Conta
    Main *--> IConta
```
--------------------------------------------
> Aproveite o projeto e explore os conceitos de POO em Java no contexto de um banco digital! 🎊
