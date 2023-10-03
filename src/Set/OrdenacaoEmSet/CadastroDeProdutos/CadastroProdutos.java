package Set.OrdenacaoEmSet.CadastroDeProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qtd) {
        produtoSet.add(new Produto(nome, preco, cod, qtd));
    }

    public Set<Produto> exibirProdutosNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1598, "Produto 1", 8, 3);
        cadastroProdutos.adicionarProduto(1923, "Produto 2", 12, 1);
        cadastroProdutos.adicionarProduto(1076, "Produto 3", 4, 2);
        cadastroProdutos.adicionarProduto(7986, "Produto 4", 10, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosNome());

        System.out.println(cadastroProdutos.exibirPorPreco());


    }

}
