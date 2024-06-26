package exceptions;

public class CepInvalidoException extends Exception {

    public CepInvalidoException() {
        super("CEP inválido");
    }

    public CepInvalidoException(String message) {
        super(message);
    }
}
