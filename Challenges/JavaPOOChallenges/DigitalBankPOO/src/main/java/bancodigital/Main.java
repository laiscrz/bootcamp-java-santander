package main.java.bancodigital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.java.bancodigital.exceptions.SaldoInsuficienteException;
import main.java.bancodigital.model.Banco;
import main.java.bancodigital.model.Cliente;
import main.java.bancodigital.model.ClienteFisico;
import main.java.bancodigital.model.ClienteJuridico;
import main.java.bancodigital.model.Conta;
import main.java.bancodigital.model.ContaCorrente;
import main.java.bancodigital.model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uso do List
        List<Conta> contas = new ArrayList<>();

        // Adicionando duas contas ao array de contas
        Cliente cliente1 = new ClienteFisico("Alice", "123.456.789-00");
        Conta conta1 = new ContaCorrente(cliente1);
        contas.add(conta1);

        Cliente cliente2 = new ClienteJuridico("Empresa XYZ", "12.345.678/0001-99");
        Conta conta2 = new ContaPoupanca(cliente2);
        contas.add(conta2);

        Banco banco = new Banco("Banco Digital", contas);

        System.out.println("---------Bem-vindo ao Banco Digital!--------");

        while (true) {
            exibirMenu();

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha após o nextInt()

            switch (opcao) {
                case 1:
                    criarConta(scanner, contas);
                    break;
                case 2:
                    realizarOperacoes(scanner, banco);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Criar conta");
        System.out.println("2. Realizar operações");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarConta(Scanner scanner, List<Conta> contas) {
        System.out.println("=== Criar Conta ===");
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Tipo de cliente (Físico/F ou Jurídico/J): ");
        String tipoCliente = scanner.nextLine().toUpperCase();

        Cliente cliente;
        Conta novaConta = null;

        if (tipoCliente.equals("F")) {
            System.out.print("CPF do cliente: ");
            String cpf = scanner.nextLine();
            cliente = new ClienteFisico(nomeCliente, cpf);
        } else if (tipoCliente.equals("J")) {
            System.out.print("CNPJ do cliente: ");
            String cnpj = scanner.nextLine();
            cliente = new ClienteJuridico(nomeCliente, cnpj);
        } else {
            System.out.println("Tipo de cliente inválido!");
            return;
        }

        System.out.print("Tipo de conta (Corrente/C ou Poupança/P): ");
        String tipoConta = scanner.nextLine().toUpperCase();
        if (tipoConta.equals("C")) {
            novaConta = new ContaCorrente(cliente);
            contas.add(novaConta);
            System.out.println("Conta corrente criada com sucesso!");
        } else if (tipoConta.equals("P")) {
            novaConta = new ContaPoupanca(cliente);
            contas.add(novaConta);
            System.out.println("Conta poupança criada com sucesso!");
        } else {
            System.out.println("Tipo de conta inválido!");
            return;
        }

        // Exibir informações da conta criada
        if (novaConta != null) {
            System.out.println("Informações da nova conta:");
            novaConta.imprimirInfosComuns();
        }
    }

    private static void realizarOperacoes(Scanner scanner, Banco banco) {
        System.out.println("=== Realizar Operações ===");
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        Conta contaSelecionada = null;
        for (Conta conta : banco.getContas()) {
            if (conta.getNumero() == numeroConta) {
                contaSelecionada = conta;
                break;
            }
        }

        if (contaSelecionada == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.println("Bem-vindo(a) de volta, " + contaSelecionada.getCliente().getNome() + "!");

        while (true) {
            exibirMenuOperacoes();

            int operacao = scanner.nextInt();
            scanner.nextLine(); 

            switch (operacao) {
                case 1:
                    realizarDeposito(scanner, contaSelecionada);
                    break;
                case 2:
                    realizarSaque(scanner, contaSelecionada);
                    break;
                case 3:
                    realizarTransferencia(scanner, contaSelecionada, banco);
                    break;
                case 4:
                    consultarSaldo(contaSelecionada);
                    break;
                case 5:
                    imprimirExtrato(contaSelecionada);
                    break;
                default:
                    System.out.println("Operação inválida!");
            }

            System.out.print("Deseja realizar outra operação nesta conta? (S/N): ");
            String resposta = scanner.nextLine().toUpperCase();
            if (!resposta.equals("S")) {
                break;
            }
        }
    }

    private static void exibirMenuOperacoes() {
        System.out.println("=== Menu de Operações ===");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Transferir");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Imprimir Extrato");
        System.out.print("Escolha uma operação: ");
    }

    private static void realizarDeposito(Scanner scanner, Conta conta) {
        System.out.print("Valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();

        conta.depositar(valorDeposito);
        System.out.println("Depósito realizado com sucesso!");
    }

}
