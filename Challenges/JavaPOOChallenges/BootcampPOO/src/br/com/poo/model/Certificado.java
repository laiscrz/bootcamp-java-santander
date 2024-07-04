package br.com.poo.model;

import java.time.LocalDate;

public class Certificado {
    private Dev dev;
    private Curso curso;
    private LocalDate dataConclusao;

    public Certificado(Dev dev, Curso curso, LocalDate dataConclusao) {
        this.dev = dev;
        this.curso = curso;
        this.dataConclusao = dataConclusao;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Certificado = { DEV: " + dev.getNome() +
                ", curso: " + curso.getTitulo() +
                ", dataConclusao: " + dataConclusao +
                '}';
    }
}
