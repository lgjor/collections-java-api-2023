package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    // Atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (!produtoSet.isEmpty()) {
            System.out.println(produtoSet);
        } else {
            System.out.println("O cadastro de produtos está vazio!");
        }
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set <Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set <Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastroProdutos.adicionarProduto(2, "Produto B", 20.0, 3);
        cadastroProdutos.adicionarProduto(4, "Produto D", 11.0, 5);
        cadastroProdutos.adicionarProduto(3, "Produto C", 15.0, 8);
        System.out.println("Produtos cadastrados:"+ cadastroProdutos.produtoSet);
        // Exibindo produtos por nome
        System.out.println("Produtos ordenados por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        // Exibindo produtos por preço
        System.out.println("Produtos ordenados por preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
