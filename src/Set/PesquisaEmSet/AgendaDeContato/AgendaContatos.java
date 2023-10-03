package Set.PesquisaEmSet.AgendaDeContato;

import Set.PesquisaEmSet.AgendaDeContato.Contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for( Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                 contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContatos("Camila" , 123456);
        agendaContatos.adicionarContatos("Camila", 859453);
        agendaContatos.adicionarContatos("Camila Cavalcante", 1111111111);
        agendaContatos.adicionarContatos("Camila DIO", 675483);
        agendaContatos.adicionarContatos("Maria Silva", 94938742);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        agendaContatos.exibirContato();
    }

}
