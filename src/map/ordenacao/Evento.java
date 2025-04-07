package map.ordenacao;

public class Evento {

    // Atributos
    private String nome;
    private String atracao;

    // Construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public String getAtracao() {
        return atracao;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", atracao='" + getAtracao() + "'" +
            "}";
    }


}
