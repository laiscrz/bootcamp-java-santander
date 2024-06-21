package edu.dio.vi;
public class PatternComponent {

    public static void main(String[] args) {

        // Java Beans

        // VARIAVEIS
        // Não recomendado
        double salMedio = 1500.23; // variável abreviada, o que dificulta a compreensão
        String emails = "aluno@escola.com"; // confuso se a variável seria um array ou único e-mail
        String myName = "JOSEPH"; // se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

        System.out.println("Não recomendados: ");
        System.out.println(salMedio);
        System.out.println(emails);
        System.out.println(myName);

        // Recomendado
        double salarioMedio = 1500.23;
        String email = "aluno@escola.com";
        String[] emailsAll = { "professor@escola.com" , "aluno@escola.com" };
        String meuNome = "JOSEPH";

        System.out.println("Recomendado: ");
        System.out.println(salarioMedio);
        System.out.println(email);
        System.out.println(emailsAll[0]);
        System.out.println(emailsAll[1]);
        System.out.println(meuNome);

        // MÉTODOS
        /*
        somar(int n1, int n2){};

        abrirConexao(){}; 

        concluirProcessamento() {}; 

        findById(int id){}; // não se assuste, você verá muito método em inglês em sua jornada

        calcularImprimir(){}; // há algo de errado neste método, ele deveria ter uma única finalidade
        */
    }
}
