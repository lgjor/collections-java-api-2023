package map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    // Atributos
    private Map<LocalDate, Evento> eventosMap;
    
    // Construtor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // Métodos

    // Método para adicionar evento
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    // Método para exibir a agenda de eventos
    public void exibirAgenda(){
        System.out.println( organizarEventosPorData() );
    }

    // Método para organizar na ordem crescente pela data
    public Map<LocalDate, Evento> organizarEventosPorData(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        return eventosTreeMap;
    }

    // Método para obter o próximo evento
    public void obterProximoEvento(){

        // Organiza os eventos por data
        Map<LocalDate, Evento> eventosTreeMap = organizarEventosPorData();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        // Encontra o próximo evento
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximoEvento + " na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 7), "Evento 4", "Atração 4");
        System.out.println("Eventos organizados por data: ");
        agendaEventos.exibirAgenda(); 

        System.out.println("Próximo evento: ");
        agendaEventos.obterProximoEvento();
    }

}
