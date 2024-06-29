package br.com.dio;

public class Conta {
    // Atributos privados -> encapsulamento
    private double saldo; // Saldo da conta
    private int numeroConta; // Número da conta

    // Construtor da classe Conta
    public Conta(int numeroContaInicial) {
        this.numeroConta = numeroContaInicial; // Inicializa o número da conta
        this.saldo = 0.0; // Inicia o saldo da conta com zero
    }

    // Método para realizar um depósito na conta
    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor; // Adiciona o valor ao saldo da conta
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta " + this.numeroConta + ".");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para realizar um saque na conta
    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor; // Subtrai o valor do saldo da conta
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta " + this.numeroConta + ".");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return this.saldo;
    }
}