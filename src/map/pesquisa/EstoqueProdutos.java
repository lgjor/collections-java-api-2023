package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // Atributos
    private Map<Long, Produto> estoqueProdutosMap;
    
    // Construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // Métodos
    
    // Método para adicionar produto
    public void  adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    // Método para exibir produtos
    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    // Método para calcular valor total do estoque
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    // Método para obter produto mais caro
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        
        // Criando uma instância da classe EstoqueProdutos
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoque.adicionarProduto(4L, "Produto D", 8, 20.0);
        
        // Exibindo os produtos no estoque
        estoque.exibirProdutos();

        // Calculando e exibindo o valor total do estoque
        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());

        // Obtendo e exibindo o produto mais caro
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
    }
}