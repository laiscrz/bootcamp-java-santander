package br.com.poo.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.poo.interfaces.ICertificado;

public class Certificado implements ICertificado {
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
    public boolean isCertificadoValido() {
        LocalDate hoje = LocalDate.now();
        long diasDesdeConclusao = ChronoUnit.DAYS.between(dataConclusao, hoje);
        return diasDesdeConclusao <= 365; 
    }

    @Override
    public String obterDetalhesCertificado() {
        String detalhes = "-------- CERTIFICADO --------" +
                "\nDEV: " + dev.getNome() +
                "\nCURSO: " + curso.getTitulo() +
                "\nDATA DA CONCLUSÃO: " + dataConclusao;
        return detalhes;
    }
}
