package list.operacoesbasicas;

// Classe Item
public class Item {
    // Atributo
    private String descricao;
    private double preco;
    private int quantidade;

    // Construtor

    public Item(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item: " +
        descricao + '\'';
    }
}