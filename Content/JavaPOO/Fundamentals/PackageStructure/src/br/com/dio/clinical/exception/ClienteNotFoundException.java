package br.com.dio.clinical.exception;

// exemplo
public class ClienteNotFoundException extends RuntimeException {

    public ClienteNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ClienteNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
