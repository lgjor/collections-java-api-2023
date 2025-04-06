package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(Contato contato) {
        if (contatoSet.add(contato)) {
            System.out.println("Contato adicionado com sucesso: " + contato);
        } else {
            System.out.println("Contato já existe na agenda: " + contato);
        }
    }

    public void exibirContatos() {
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        } else {
            System.out.println("A agenda de contatos está vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                return contatoAtualizado;
            }
        }
        System.out.println("Contato não encontrado na agenda: " + nome);
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();
        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato(new Contato("João", 123456789));
        agendaContatos.adicionarContato(new Contato("Maria", 987654321));
        agendaContatos.adicionarContato(new Contato("Maria Fernandes", 55555555));
        agendaContatos.adicionarContato(new Contato("Ana", 88889999));
        agendaContatos.adicionarContato(new Contato("Fernando", 77777777));
        agendaContatos.exibirContatos();
        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        // Atualizando o número de um contato
        System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Maria", 666666));;
        agendaContatos.exibirContatos();
    }
} 


        