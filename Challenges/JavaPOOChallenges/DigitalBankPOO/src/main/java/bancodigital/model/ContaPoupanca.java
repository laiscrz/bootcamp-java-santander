package main.java.bancodigital.model;

public class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void calcularRendimento() {
        this.saldo *= (1 + TAXA_RENDIMENTO);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Poupança ---");
        super.imprimirInfosComuns();
        calcularRendimento(); // Calcular rendimento antes de imprimir
        System.out.println("Status: Rendimento aplicado. Saldo final após rendimento: " + saldo);
    }
}
