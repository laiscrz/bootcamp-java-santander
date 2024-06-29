package br.com.iphone.componentes;

public class NavegadorInternet extends ComponenteWeb {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo página: " + url);
        System.out.println("Página aberta com sucesso!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
        System.out.println("A nova aba está pronta para uso!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página atual...");
        System.out.println("Página atualizada com novos conteúdos!");
    }
}
