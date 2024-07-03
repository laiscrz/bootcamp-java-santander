package main.java.bancodigital.exceptions;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar a operação.");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
