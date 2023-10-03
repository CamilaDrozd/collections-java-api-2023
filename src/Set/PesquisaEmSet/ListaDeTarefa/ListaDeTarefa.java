package Set.PesquisaEmSet.ListaDeTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefa {

    //Atributos
    private Set<Tarefa> tarefaSet;

    public ListaDeTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Lista vazia");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefaConcluida(){
        Set<Tarefa>  tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefaPendente(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isConcluida()){
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;
    }

    public void marcarTarefaConcluida(String descricao){
        for ( Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = t;
                break;
            }
        }
        if (tarefaPendente != null){
            if (tarefaPendente.isConcluida()){
                tarefaPendente.setConcluida(false);
            }
        }else {
            System.out.println("Tarefa não está na lista");
        }
    }

    public void limparListaTarefa(){
        if (tarefaSet.isEmpty()){
            System.out.println("Lista ja esta vazia");
        }else{
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {

        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();

        listaDeTarefa.adicionarTarefa("Lavar a louça");
        listaDeTarefa.adicionarTarefa("Lavar o quintal");
        listaDeTarefa.adicionarTarefa("Regar as plantas");
        listaDeTarefa.adicionarTarefa("Guardar as louças");

        System.out.println("Total de tarefas na lista: " + listaDeTarefa.contarTarefas());

        listaDeTarefa.exibirTarefas();



        listaDeTarefa.marcarTarefaConcluida("lavar o quintal");



        listaDeTarefa.exibirTarefas();



        System.out.println(listaDeTarefa.obterTarefaConcluida());


        System.out.println(listaDeTarefa.obterTarefaPendente());




        listaDeTarefa.marcarTarefaConcluida("guardar as louças");
        listaDeTarefa.removerTarefa("Lavar o quintal");

        listaDeTarefa.exibirTarefas();

        listaDeTarefa.limparListaTarefa();

        listaDeTarefa.exibirTarefas();

    }

}
