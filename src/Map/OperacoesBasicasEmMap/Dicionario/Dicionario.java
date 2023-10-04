package Map.OperacoesBasicasEmMap.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    //Atributos

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else {
            System.out.println("Lista vazia");
        }
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisar = null;
        if (!dicionarioMap.isEmpty()){
            palavraPesquisar = dicionarioMap.get(palavra);
        }else {
            System.out.println("Lista vazia");
        }
        return palavraPesquisar;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 1", "Def 1");
        dicionario.adicionarPalavra("Palavra 2", "2");
        dicionario.adicionarPalavra("Palavra 3", "Definicao 03");
        dicionario.adicionarPalavra("Palavra 4", "04");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Palavra 3"));

        dicionario.removerPalavra("Palavra 4");

        dicionario.exibirPalavras();

    }

}
