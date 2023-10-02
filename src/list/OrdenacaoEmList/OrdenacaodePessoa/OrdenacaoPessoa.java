package list.OrdenacaoEmList.OrdenacaodePessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    //Atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.63);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 27, 1.83);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 35, 1.60);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 19, 1.75);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
       // System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

