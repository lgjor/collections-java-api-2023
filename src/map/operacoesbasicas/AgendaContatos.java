package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(Map<String,Integer> agendaContatoMap) {
        this.agendaContatoMap = new HashMap<>();
    }

    // Método para adicionar um contato
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }
    
    // Método para remover um contato
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    // Método para exibir todos os contatos
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    // Método para pesquisar por nome
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        
        // Criando um objeto da classe AgendaContatos
        AgendaContatos agenda = new AgendaContatos(new HashMap<>());
        
        // Adicionando contatos
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Charlie", 555555555);
        
        
        // Exibindo contatos
        agenda.exibirContatos();
        
        // Pesquisando por um contato
        Integer telefone = agenda.pesquisarPorNome("Alice");
        System.out.println("Telefone de Alice: " + telefone);
        
        // Removendo um contato
        agenda.removerContato("Bob");
        
        // Exibindo contatos após remoção
        agenda.exibirContatos();
    }
}
