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

    
}
