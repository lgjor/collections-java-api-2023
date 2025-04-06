package set.operacoesbasicas;

public class Convidado {

    //atributos
    private String nome;
    private int codigoConvite;

    //construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + codigoConvite + "'" +
            "}";
    }


    //getters
    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }

}
