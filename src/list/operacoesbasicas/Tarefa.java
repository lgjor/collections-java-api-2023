package list.operacoesbasicas;

public class Tarefa {
    // Atributo
    private final String descricao;

    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Métodos
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa: " +
        descricao + '\'';
    }
}
