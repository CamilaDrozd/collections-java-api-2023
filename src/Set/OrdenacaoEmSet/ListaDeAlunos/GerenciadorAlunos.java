package Set.OrdenacaoEmSet.ListaDeAlunos;

import java.util.*;

public class GerenciadorAlunos {

    //Atributos
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula , double media){
        alunosSet.add(new Alunos(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Alunos alunoRemover = null;
        if (!alunosSet.isEmpty()){
            for (Alunos a : alunosSet){
                if (a.getMatricula().equals(matricula)){
                    alunoRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoRemover);
        }else {
            throw new RuntimeException("O conjunto está vazio");
        }
        if (alunoRemover == null){
            System.out.println("Matricula não encontrada");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Alunos> alunosNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){
            System.out.println(alunosNome);
        }else {
            System.out.println("Lista vazia");
        }
    }


    public void exibirPorNota(){
        Set<Alunos> alunosNotas = new TreeSet<>( new Alunos.ComparatorPorNota());
        if (!alunosSet.isEmpty()){
            alunosNotas.addAll(alunosSet);
            System.out.println(alunosNotas);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public void exibirAlunos(){
        if (!alunosSet.isEmpty()){
            System.out.println(alunosSet);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 27366428L, 7.5);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 94204841L, 6);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 19372749L, 8.5);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 12345670L, 8);

        gerenciadorAlunos.exibirAlunos();


        gerenciadorAlunos.exibirPorNota();

        gerenciadorAlunos.removerAluno(94204841L);

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.exibirAlunosPorNome();

    }

}
