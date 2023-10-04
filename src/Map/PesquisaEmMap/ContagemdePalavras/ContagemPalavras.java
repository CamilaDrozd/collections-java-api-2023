package Map.PesquisaEmMap.ContagemdePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributos

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removePalavra(String palavra){
        if (!palavrasMap.isEmpty()){
            palavrasMap.remove(palavra);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!palavrasMap.isEmpty()){
           for (int contagem : palavrasMap.values()){
               contagemTotal += contagem;
           }
        }else{
            System.out.println("Lista vazia");
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        Integer qtdFrequencia = 0;
        if (!palavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
                if (entry.getValue() > qtdFrequencia){
                    palavraMaisFrequente = entry.getKey();
                    qtdFrequencia = entry.getValue();
                }
            }
        }else {
            throw new RuntimeException("Lista Vazia");
        }
        return palavraMaisFrequente;
    }


    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra 1", 4);
        contagemPalavras.adicionarPalavra("Palavra 2", 2);
        contagemPalavras.adicionarPalavra("Palavra 3", 5);
        contagemPalavras.adicionarPalavra("Palavra 4", 3);
        contagemPalavras.adicionarPalavra("Palavra 5", 1);

        System.out.println("A contagem total das palavras é: "
                + contagemPalavras.exibirContagemPalavras());

        contagemPalavras.removePalavra("Palavra 3");

        System.out.println("A contagem total das palavras é: "
                + contagemPalavras.exibirContagemPalavras());

        System.out.println("A palavra mais frequente é " + contagemPalavras.encontrarPalavraMaisFrequente());

    }

}
