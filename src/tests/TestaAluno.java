package tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAluno {
    public static void main(String[] args) {
        
        Collection<String> alunos = new HashSet<>();
        alunos.add("Aluno 01");
        alunos.add("Aluno 02");
        alunos.add("Aluno 03");
        alunos.add("Aluno 04");
        alunos.add("Aluno 05");
        alunos.add("Aluno 03");

        System.out.println(alunos);

        // SET NÃO POSSUI ORDEM E NÃO REPETE ELEMENTOS
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println();

        // UTILIZANDO O FOREEACH ALUNO ->
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        // SET TAMANHO IMUTÁVEL
        System.out.println(alunos.size());

        System.out.println();

        // UTILIZANDO CONTAINS
        boolean alunoMatriculado = alunos.contains("Aluno 04");
        System.out.println(alunoMatriculado);

        alunos.remove("Aluno 03");
        System.out.println(alunos);

        //CRIANDO LISTA A PARTIR DO SET E ORGANIZANDO OS ELEMENTOS
        List<String> alunosEmLista = new ArrayList<>(alunos);
        alunosEmLista.sort(null);
        System.out.println(alunosEmLista);
    }

}
