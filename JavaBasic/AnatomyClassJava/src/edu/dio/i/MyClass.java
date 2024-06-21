package edu.dio.i;

// Nome da classe deve começar com letra maiúscula e seguir o padrão CamelCase
public class MyClass {

    // Main method - necessário se a classe for executável
    public static void main(String[] args) {
        
        // public: Modificador de acesso, indica que o método pode ser acessado de fora
        // da classe.
        // static: Método pertence à classe em si e não a instâncias específicas da
        // classe.
        // void: O método não retorna nenhum valor.
        // main: Nome do método principal que é executado quando a classe é iniciada.
        // (String[] args): Parâmetro do método, um array de strings que pode ser
        // passado quando o programa é executado.

        // Código dentro do método main

        System.out.println("Hello World !");

        // System: Classe do pacote java.lang que fornece acesso ao sistema e suas
        // propriedades.
        // out: Objeto do tipo PrintStream dentro da classe System, usado para saída
        // padrão.
        // println: Método de PrintStream usado para imprimir uma linha de texto seguida
        // por uma quebra de linha.
    }
}
