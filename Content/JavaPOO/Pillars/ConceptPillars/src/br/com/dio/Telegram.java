package br.com.dio;

public class Telegram extends MessageService{

    @Override
    public void enviarMensagem() {
        validarEConectar(); // Usando método protegido para validar a conexão
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistorico(); // Usando método protegido para salvar o histórico
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
