package Set.OperacoesBasicas.ConjuntodePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavraUnica {

    //Atributo
    private Set<String> palavraSet;

    public ConjuntoPalavraUnica() {
        this.palavraSet = new HashSet<>();
    }


    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removePalavra(String palavra){
       if (!palavraSet.isEmpty()){
           if (palavraSet.contains(palavra)){
               palavraSet.remove(palavra);
           }else {
               System.out.println("Palavra não está na lista");
           }
       }else {
           System.out.println("Lista de palavras vazia");
       }
    }

    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavraUnica conjuntoPalavraUnica = new ConjuntoPalavraUnica();

        conjuntoPalavraUnica.adicionarPalavra("Agridoce");
        conjuntoPalavraUnica.adicionarPalavra("Azedo");
        conjuntoPalavraUnica.adicionarPalavra("Doce");
        conjuntoPalavraUnica.adicionarPalavra("Salgado");

        conjuntoPalavraUnica.exibirPalavrasUnicas();

        System.out.println("A palavra 'Doce' está no conjunto? " + conjuntoPalavraUnica.verificarPalavra("Doce"));


        conjuntoPalavraUnica.exibirPalavrasUnicas();

        conjuntoPalavraUnica.removePalavra("Azedo");

        conjuntoPalavraUnica.exibirPalavrasUnicas();


    }

}
