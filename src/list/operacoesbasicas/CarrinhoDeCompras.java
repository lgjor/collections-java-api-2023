package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributos
    private List<Item> itens;

    // Construtor
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Métodos
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String descricao) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itens) {
            if (i.getDescricao().equalsIgnoreCase(descricao)) {
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public static void exibirItens(CarrinhoDeCompras carrinho) {
        System.out.println(carrinho.itens);
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        exibirItens(carrinhoDeCompras);
        carrinhoDeCompras.adicionarItem("Lápis", 20, 3);
        exibirItens(carrinhoDeCompras);
        carrinhoDeCompras.adicionarItem("Caneta", 30, 2);
        exibirItens(carrinhoDeCompras);
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Lápis");
        exibirItens(carrinhoDeCompras);
        System.out.println("O valor total do carrinho é: " + carrinhoDeCompras.calcularValorTotal());
    }

}