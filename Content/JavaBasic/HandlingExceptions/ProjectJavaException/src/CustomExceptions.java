import exceptions.CepInvalidoException;

public class CustomExceptions {
    public static void main(String[] args) {
        String cep = "23765064";
        
        try {
            String cepFormatado = formatarCep(cep);
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: CEP inválido.");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();
        
        // Simulando um CEP formatado
        return "23.765-064";
    }
}
