package list.OrdenacaoEmList.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    //Atributos
    private List<Integer> numero;

    public OrdenacaoNumeros() {
        this.numero = new ArrayList<>();
    }


    public void adicionarNumero(int num){
        numero.add(num);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(numero);
        if(!numero.isEmpty()) {
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        }else {
           throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numeroDescendente = new ArrayList<>(numero);
        if (!numero.isEmpty()){
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirLista(){
        if (!numero.isEmpty()){
            System.out.println(this.numero);
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordemNum = new OrdenacaoNumeros();

        ordemNum.adicionarNumero(4);
        ordemNum.adicionarNumero(76);
        ordemNum.adicionarNumero(33);
        ordemNum.adicionarNumero(18);
        ordemNum.adicionarNumero(1);
        ordemNum.adicionarNumero(39);

        ordemNum.exibirLista();

        System.out.println(ordemNum.ordenarAscendente());

        System.out.println(ordemNum.ordenarDescendente());


    }
}
