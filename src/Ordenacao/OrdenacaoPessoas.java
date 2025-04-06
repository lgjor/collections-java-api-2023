package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributo
    private List<Pessoa> pessoaList;

    // Construtor
    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorAltura() {
        // Implementação do método ordenarPorAltura para ordenar a lista de pessoas com base na altura
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }   
    public List<Pessoa> ordenarPorIdade() {
        // Implementação do método ordenarPorIdade para ordenar a lista de pessoas com base na idade
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alice", 25, 1.65);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.75);
        ordenacaoPessoas.adicionarPessoa("Charlie", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("Diana", 28, 1.60);
        ordenacaoPessoas.adicionarPessoa("Eve", 22, 1.70);
        ordenacaoPessoas.adicionarPessoa("Frank", 35, 1.85);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());        
    }
}