package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributos
    private final Set<Convidado> convidadoSet;

    //construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }    

    //métodos
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }        
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("João", 1);
        conjunto.adicionarConvidado("Maria", 2);
        conjunto.adicionarConvidado("Pedro", 3);

        System.out.println("Total de convidados: " + conjunto.contarConvidados());

        conjunto.exibirConvidados();

        conjunto.removerConvidado(2);

        System.out.println("Total de convidados após remoção: " + conjunto.contarConvidados());
        conjunto.exibirConvidados();
    }
}