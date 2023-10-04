package Map.OperacoesBasicasEmMap.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributo

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome =  agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila" , 286483924);
        agendaContatos.adicionarContato("Camila" , 394020837);
        agendaContatos.adicionarContato("Camila Cavalcante" , 274629291);
        agendaContatos.adicionarContato("Camila DIO" , 917364890);
        agendaContatos.adicionarContato("Maria Silva" , 425366778);
        agendaContatos.adicionarContato("Camila" , 444444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContato();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Camila DIO"));

    }

}
