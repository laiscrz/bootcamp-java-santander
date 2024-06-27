package br.com.dio;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo", 35),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 33),
    PIAUI("PI", "Piauí", 22),
    MARANHAO("MA", "Maranhão", 21),
    PARAIBA("PB", "Paraíba", 25);

    private String nome;
    private String sigla;
    private int codigoIbge;

    private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
