package br.com.iphone;

import br.com.iphone.reprodutor.ReprodutorMusical;
import br.com.iphone.dispositivos.AparelhoTelefonico;
import br.com.iphone.componentes.NavegadorInternet;

public class IPhone {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public IPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.iniciar();
    }

    void iniciar() {
        System.out.println("*******Iniciando iPhone*******");
        System.out.println("-----------------------------");
        System.out.println("Abrindo Reprodutor Musical...");
        reprodutorMusical.selecionarMusica("Sorry by Justin Bieber");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        System.out.println("-----------------------------");
        
        System.out.println("Abrindo Aparelho Telefonico...");
        aparelhoTelefonico.ligar("123-456-7890");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.encerrar();
        System.out.println("-----------------------------");
        
        System.out.println("Abrindo Navegador de Internet...");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina("www.apple.com");
        navegadorInternet.atualizarPagina();
        System.out.println("-----------------------------");
        
        System.out.println("*******Encerrando iPhone*******");
    }
}
