package br.com.dio.cases.i;

public class ProcessSelective {

    // Constante do Salario Base
    private static final double SALARIO_BASE = 2000.00;

    public static void main(String[] args) {

        // Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 
        // e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:
        
        // Teste de casos com diferentes valores de salário pretendido
        
        // Se o valor salário base for maior que valor salário pretendido, imprima: LIGAR PARA O CANDIDATO;
        processarCandidatura(SALARIO_BASE, 1800.00); // Exemplo: salário pretendido é menor que o salário base
        
        // Se o valor salário base for igual ao valor salário pretendido, imprima: LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
        processarCandidatura(SALARIO_BASE, 2000.00); // Exemplo: salário pretendido é igual ao salário base
        
        // Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.
        processarCandidatura(SALARIO_BASE, 2200.00); // Exemplo: salário pretendido é maior que o salário base
    }

    private static void processarCandidatura(double salarioBase, double salarioPretendido) {
        if (salarioBase > salarioPretendido) {
            // Se o valor salário base for maior que o valor salário pretendido
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            // Se o valor salário base for igual ao valor salário pretendido
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            // Se o valor salário base for menor que o valor salário pretendido
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
