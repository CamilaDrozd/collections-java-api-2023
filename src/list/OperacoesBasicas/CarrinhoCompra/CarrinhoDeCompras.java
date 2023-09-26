package list.OperacoesBasicas.CarrinhoCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //Atributo
    private List<Item> carrinhoItem;

    public CarrinhoDeCompras() {
        this.carrinhoItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        carrinhoItem.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!carrinhoItem.isEmpty()){


        for ( Item ite : carrinhoItem) {
            if (ite.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(ite);
            }
        }
        carrinhoItem.removeAll(itemParaRemover);
    }
    } else{
        System.out.println("Carrinho Vazio");
    }



    public double calcularTotal(){
        double valorCarrinho = 0;
        if (!carrinhoItem.isEmpty()){
            List<Item> valorTotal = new ArrayList<>();
            for( Item t : carrinhoItem){
                double valorItem = t.getPreco() * t.getQuantidade();
                valorCarrinho =+ valorItem;
            }
            return valorCarrinho;
        } else{
            System.out.println("Lista Vazia");
            return valorCarrinho;
        }
    }

    public void exibirItens(){
        System.out.println(carrinhoItem.toString());
    }


}
