package main.java.operacoes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemover.add(i);
                }
            }
            itemList.removeAll(itemRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double total = 0.00;

        for (Item item : itemList) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                System.out.println(item);
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras = {" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        // Adicionando itens ao carrinho
        carrinhoCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoCompras.adicionarItem("Caneta", 3d, 5);
        carrinhoCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoCompras.adicionarItem("Borracha", 2d, 2);
        carrinhoCompras.adicionarItem("Apontador", 4d, 6);

        // Exibindo os itens no carrinho
        carrinhoCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
    }
}
