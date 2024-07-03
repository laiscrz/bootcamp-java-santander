package main.java.bancodigital.interfaces;

import main.java.bancodigital.exceptions.SaldoInsuficienteException;

public interface IConta {

    void sacar(double valor) throws SaldoInsuficienteException;;

    void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
