package br.com.dio.lanchonete;

public class MainEstabelecimento {
    public static void main(String[] args) {
        System.out.println("---------Cozinheiro---------");
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        // ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        System.out.println("---------Almoxarife---------");
        Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estarem disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        // ação que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        System.out.println("---------Atendente---------");
        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        System.out.println("---------Cliente---------");
        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // não deveria, mas o estabelecimento
        // ainda não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        // esta ação é muito sigilosa, qua tal ser privada ?
        cliente.consultarSaldoAplicativo();

        // já pensou os clientes ouvindo que o gás acabou ?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
