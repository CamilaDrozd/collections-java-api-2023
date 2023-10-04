package Map.PesquisaEmMap.EstoqueProdutosComPreco;

public class Produto {

    //Atributos

    private String nome;
    private double preco;
    private int quatidade;

    public Produto(String nome, double preco, int quatidade) {
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuatidade() {
        return quatidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quatidade=" + quatidade +
                '}';
    }
}
