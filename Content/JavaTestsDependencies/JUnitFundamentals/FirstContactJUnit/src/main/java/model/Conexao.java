package model;

import java.util.logging.Logger;

public class Conexao {

    private static final Logger LOGGER = Logger.getLogger(Conexao.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciando Conexão...");
    }

    public static void fecharConexao() {
        LOGGER.info("Fechando Conexão...");
    }

    public static void insert(Pessoa pessoa) {
        LOGGER.info("Dados Inseridos");
    }

    public static void delete(Pessoa pessoa) {
        LOGGER.info("Dados deletados");
    }
}
