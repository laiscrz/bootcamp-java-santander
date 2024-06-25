package edu.dio;

public class DefinitionsMethods {

    // Método público que retorna a soma de dois números inteiros
    public double somar(int num1, int num2) {
        // Lógica para somar os números num1 e num2
        return num1 + num2;
    }

    // Método público que imprime um texto na saída padrão
    public void imprimir(String texto) {
        // Lógica para imprimir o texto recebido como parâmetro
        System.out.println(texto);
    }

    // Método público que realiza a divisão de dois números inteiros e lança uma
    // exceção se houver erro
    public double dividir(int dividendo, int divisor) throws Exception {
        // Verifica se o divisor é zero
        if (divisor == 0) {
            throw new Exception("Divisão por zero não permitida");
        }
        // Retorna o resultado da divisão
        return (double) dividendo / divisor;
    }

    // Método privado que não pode ser acessado por outras classes no projeto
    private void metodoPrivado() {
        // Lógica do método privado
    }

    // Método público para exemplificar o uso de um método privado
    public void usarMetodoPrivado() {
        // Dentro da própria classe, podemos chamar o método privado
        metodoPrivado();
    }

    // Método público que deveria retornar um booleano para indicar se a validação
    // foi bem-sucedida
    public boolean validar() {
        // Lógica de validação
        return false; // Exemplo simples, deve ser implementado corretamente
    }

    // Método público que realiza o cálculo e envio de alguma informação
    public void calcularEnviar() {
        // Lógica para calcular e enviar informações
    }

    // Método público que grava informações de um cliente
    // Construtor (EXEMPLO)
    public void gravarCliente(String nome, String cpf, Integer telefone) {
        // Lógica para gravar informações de um cliente usando parâmetros individuais

        // Poderia ser melhorado para aceitar um objeto Cliente como parâmetro:
        // public void gravarCliente(Cliente cliente) {}
        // ou simplificado para:
        // public void gravar(Cliente cliente) {}
    }

}
