package Set.OrdenacaoEmSet.CadastroDeProdutos;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    //Atributos
    private String nome;
    private double preco;
    private long codigo;
    private int quantidade;

    public Produto(String nome, double preco, long codigo, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto " +
                "Nome ='" + nome + '\'' +
                ", Preco = " + preco +
                ", Codigo = " + codigo +
                ", Quantidade = " + quantidade + "\n";
    }


}
