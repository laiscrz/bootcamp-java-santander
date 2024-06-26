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
            count(parameterOne, parameterTwo);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

        }

        scanner.close();
    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parameterOne >= parameterTwo) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // int contagem = parametroDois - parametroUm;
        int counts = parameterTwo - parameterOne;

        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= counts; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
