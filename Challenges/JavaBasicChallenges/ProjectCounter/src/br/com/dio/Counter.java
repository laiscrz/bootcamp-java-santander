package br.com.dio;

import java.util.Scanner;

import br.com.dio.exception.InvalidParametersException;

public class Counter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° Parametro: ");
        int parameterOne = scanner.nextInt();
        System.out.println("Digite o 2° Parametro: ");
        int parameterTwo = scanner.nextInt();

        try {

        } catch (Exception e) {

        }
    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        // int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem

    }
}
