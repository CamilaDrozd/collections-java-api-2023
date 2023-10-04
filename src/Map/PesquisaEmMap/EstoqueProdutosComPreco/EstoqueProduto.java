package Map.PesquisaEmMap.EstoqueProdutosComPreco;


import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    //Atributo

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int qtd, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, qtd));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorEstoqueTotal = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorEstoqueTotal += p.getQuatidade() * p.getPreco();
            }
        }
        return valorEstoqueTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }else {
            System.out.println("Lista vazia");
        }
        return produtMaisCaro;
    }

    public Produto obterProdutoMaisBaratp(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }else{
            System.out.println("Lista vazia");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQtdEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Map.Entry<Long,Produto> entry : estoqueProdutosMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuatidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQtdEstoque = entry.getValue();
                }
            }
        }else {
            System.out.println("Lista vazia");
        }
        return produtoMaiorQtdEstoque;
    }

    public static void main(String[] args) {

        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.exibirProdutos();
        estoqueProduto.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProduto.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProduto.adicionarProduto(3L, "Produto C", 2, 15.0);


        estoqueProduto.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProduto.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoqueProduto.obterProdutoMaisBaratp());
        System.out.println("Produto mais caro: " + estoqueProduto.obterProdutoMaisCaro());


    }


}
