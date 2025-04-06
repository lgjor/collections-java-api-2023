package ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // Implementa a interface Comparable para permitir a ordenação

    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", altura='" + getAltura() + "'" +
            "}";
    }

    @Override
    public int compareTo(Pessoa p) {
        // Implementação do método compareTo para comparar pessoas com base em sua idade
        return Integer.compare(idade, p.getIdade());
    }
    // Getters e Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }    
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // Implementação do método compare para comparar pessoas com base em sua altura
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}


