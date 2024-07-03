package main.java.bancodigital.model;

public class ContaCorrente extends Conta {
	private static final double TAXA_DEBITO = 0.10;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void debitarTaxaDebito() {
		this.saldo -= TAXA_DEBITO;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfosComuns();
		debitarTaxaDebito(); // Aplicar taxa de débito antes de imprimir
        System.out.println("Status: Taxa de débito aplicada. Saldo final após débito: " + saldo);
	}
}
