package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Métodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }   

    // Size retorna um inteiro com a quantidade de elementos da lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1: Estudar java");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2: Praticar Java");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 3: Atualizar Linkedin");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3: Atualizar Linkedin");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
