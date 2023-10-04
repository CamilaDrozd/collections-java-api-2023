package Map.OrdenacaoEmMap.LivrariaOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    //Atributo
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

   // public void adicionarLivro(String link, String titulo, String autor, double preco){
    //    livroMap.put(link, new Livro(titulo, autor, preco));
   // }


    public void adicionarLivro(String link, Livro livro) {
        livroMap.put(link, livro);
    }
    public void removerLivro(String titulo){
        List<String> chaveRemover = new ArrayList<>();
        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chaveRemover.add(entry.getKey());
                }
            }
            for (String chave : chaveRemover){
                livroMap.remove(chave);
            }
        } else {
            System.out.println("Lista vazia");
        }
    }


    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livroMaisCaro = new ArrayList<>();
        double precoMaisCaro = Double.MIN_VALUE;
        if (!livroMap.isEmpty()){
            for (Livro livro : livroMap.values()){
                if (livro.getPreco() > precoMaisCaro){
                    precoMaisCaro = livro.getPreco();
                }
            }
        }else{
            throw new RuntimeException("Lista vazia");
        }
        for (Map.Entry<String , Livro> entry : livroMap.entrySet()){
            if (entry.getValue().getPreco() == precoMaisCaro){
                Livro livroComPrecoMaisAlto = livroMap.get(entry.getKey());
                livroMaisCaro.add(livroComPrecoMaisAlto);
            }
        }
        return livroMaisCaro;
    }



}
