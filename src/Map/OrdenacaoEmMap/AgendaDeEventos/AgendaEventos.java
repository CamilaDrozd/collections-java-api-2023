package Map.OrdenacaoEmMap.AgendaDeEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    //Atributos
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }


    public void obterProximoEvento(){
        //Set<LocalDate> dateSet = eventoMap.keySet();
        //Collections<Evento> value = eventoMap.values();
        //eventoMap.get();

        LocalDate dateAtual =  LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dateAtual) || entry.getKey().isAfter(dateAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento " + proximoEvento + " acontecerá " +
                        "na data " + proximaData);
                break;
            }
        }
    }


    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 14), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 11,9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 12,9), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 2,19), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10,4), "Evento 5", "Atração 5");


        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


    }

}
