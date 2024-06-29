package br.com.dio;

public class BancoMain {
    public static void main(String[] args) {
        // ENCAPSULAMENTO -> permite manipular dados do cliente e da conta de forma
        // segura

        // Criando um cliente
        Cliente cliente = new Cliente("Maria Souza", "maria.souza@email.com");

        // Exibindo informações iniciais do cliente
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("E-mail: " + cliente.getEmail());

        System.out.println("--------------------------------------");

        // Criando uma conta para o cliente
        Conta contaCliente = new Conta(987654); // Número da conta 987654

        // Realizando operações na conta
        contaCliente.deposito(2000); // Deposita R$ 2000 na conta
        contaCliente.saque(500); // Saca R$ 500 da conta

        // Exibindo saldo atual da conta
        double saldoAtual = contaCliente.getSaldo();
        System.out.println("Saldo atual da conta: R$" + saldoAtual);

        System.out.println("--------------------------------------");

        // Atualizando informações do cliente
        cliente.setNome("Maria Silva"); // Alterando nome do cliente
        cliente.setEmail("maria.silva.novo@email.com"); // Alterando e-mail do cliente

        // Exibindo informações atualizadas do cliente
        System.out.println("Novo nome do cliente: " + cliente.getNome());
        System.out.println("Novo e-mail do cliente: " + cliente.getEmail());
    }
}
