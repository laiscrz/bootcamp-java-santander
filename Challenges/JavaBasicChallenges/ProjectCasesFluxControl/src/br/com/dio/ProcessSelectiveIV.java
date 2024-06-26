package br.com.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessSelectiveIV {
    // Constante para o salário base
    private static final double SALARIO_BASE = 2000.00;
    // Array com a lista de candidatos
    private static final String[] CANDIDATOS = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO",
            "MIRELA", "DANIELA", "JORGE" };
    // Limite máximo de candidatos selecionados
    private static final int LIMITE_CANDIDATOS = 5;
    // Limite máximo de tentativas de contato
    private static final int MAX_TENTATIVAS = 3;

    public static void main(String[] args) {

        int candidatosSelecionados = 0;
        List<String> listaSelecionados = new ArrayList<>();

        for (String candidato : CANDIDATOS) {
            if (candidatosSelecionados >= LIMITE_CANDIDATOS) {
                break;
            }

            double salarioPretendido = valorPretendido();
            System.out.println(candidato + " solicitou um salário de R$ " + salarioPretendido);

            if (salarioPretendido <= SALARIO_BASE) {
                System.out.println("LIGAR PARA O CANDIDATO: " + candidato);
                listaSelecionados.add(candidato);
                candidatosSelecionados++;
            } else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS: " + candidato);
            }
        }

        System.out.println("\nTotal de candidatos selecionados para entrevista: " + candidatosSelecionados);
        System.out.println("Lista de candidatos selecionados para o RH entrar em contato:");
        for (String selecionado : listaSelecionados) {
            System.out.println(selecionado);
        }

        // Tentar contato com os candidatos selecionados
        for (String selecionado : listaSelecionados) {
            boolean conseguiuContato = false;
            int tentativa;

            for (tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
                if (tentarContato()) {
                    conseguiuContato = true;
                    break;
                }
            }

            if (conseguiuContato) {
                System.out.println("CONSEGUIMOS CONTATO COM " + selecionado + " APÓS " + tentativa + " TENTATIVA(S)");
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + selecionado);
            }
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método que simula a tentativa de contato
    static boolean tentarContato() {
        // Simula uma chance de 50% de conseguir contato
        return ThreadLocalRandom.current().nextBoolean();
    }
}