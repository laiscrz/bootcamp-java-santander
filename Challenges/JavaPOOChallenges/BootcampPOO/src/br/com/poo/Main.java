package br.com.poo;

import java.time.LocalDate;

import br.com.poo.model.Bootcamp;
import br.com.poo.model.Certificado;
import br.com.poo.model.Curso;
import br.com.poo.model.Dev;
import br.com.poo.model.Instrutor;
import br.com.poo.model.Mentoria;

public class Main {

    public static void main(String[] args) {
        // Criação de cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprenda Java do básico ao avançado");
        cursoJava.setCargaHoraria(60);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso de JavaScript");
        cursoJs.setDescricao("Aprenda JavaScript do básico ao avançado");
        cursoJs.setCargaHoraria(30);

        // Criação de mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria para tirar dúvidas sobre Java");
        mentoriaJava.setData(LocalDate.now());

        // Criação dos instrutores
        Instrutor instrutor1 = new Instrutor("Camila");
        Instrutor instrutor2 = new Instrutor("Gleyson");

        // Adicionar conteúdos ministrados pelos instrutores
        instrutor1.adicionarConteudoMinistrado(cursoJava);
        instrutor1.adicionarConteudoMinistrado(mentoriaJava);
        instrutor2.adicionarConteudoMinistrado(cursoJs);

        // Criação do bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para desenvolvedores Java");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJs);
        bootcamp.adicionarConteudo(mentoriaJava);

        // Criação de devs
        Dev devLais = new Dev("Lais");
        Dev devMaria = new Dev("Maria");

        // Inscrição dos devs no bootcamp
        devLais.inscreverBootcamp(bootcamp);
        devMaria.inscreverBootcamp(bootcamp);

        // Progredir nos cursos
        System.out.println("Progresso de Lais antes de avançar: ");
        System.out.println("Conteúdos inscritos: " + devLais.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLais.getConteudosConcluidos());
        System.out.println("XP total: " + devLais.calcularTotalXp());

        devLais.progredir();
        devLais.progredir();

        // Gerar certificado para Lais
        Certificado certificadoLaisJava = new Certificado(devLais, cursoJava, LocalDate.now());
        System.out.println(certificadoLaisJava.obterDetalhesCertificado());

        System.out.println("------------------------------");
        System.out.println("Progresso de Lais depois de avançar: ");
        System.out.println("Conteúdos inscritos: " + devLais.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devLais.getConteudosConcluidos());
        System.out.println("XP total: " + devLais.calcularTotalXp());

        System.out.println("------------------------------");
        System.out.println("Progresso de Maria antes de avançar: ");
        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMaria.getConteudosConcluidos());
        System.out.println("XP total: " + devMaria.calcularTotalXp());

        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();

        // Gerar certificado para Maria
        Certificado certificadoMariaJs = new Certificado(devMaria, cursoJs, LocalDate.now());
        System.out.println(certificadoMariaJs.obterDetalhesCertificado());

        System.out.println("------------------------------");
        System.out.println("Progresso de Maria depois de avançar: ");
        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMaria.getConteudosConcluidos());
        System.out.println("XP total: " + devMaria.calcularTotalXp());
    }
}
