package list.PesquisaEmList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //Atributos
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Numeros: " + numeros ;
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }


    public int calcularSoma(){
        int soma = 0;
            for (Integer t: numeros)
                soma += t;

        return soma;
    }

    public int encontrarMaiorNumero(){
        int mNum = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer t : numeros){
                if (t >= mNum){
                    mNum = t;
                }
            }
            return mNum;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer t : numeros){
                if (t <= menorNum){
                    menorNum = t;
                }
            }
            return menorNum;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros.toString());
        }else {
        System.out.println("A lista está vazia");}
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();


        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);

        somaNumeros.exibirNumeros();


        System.out.println("A soma dos numeros é " + somaNumeros.calcularSoma());
        System.out.println("O maior numero é " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero é " + somaNumeros.encontrarMenorNumero());






    }
}
