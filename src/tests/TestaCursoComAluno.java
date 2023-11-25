package tests;

import java.util.Iterator;
import java.util.Set;

import models.Aluno;
import models.Aula;
import models.Curso;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções", "Lucas");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Classe", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

        Aluno a1 = new Aluno("Márcia", 3456);
        Aluno a2 = new Aluno("Cida", 3357);
        Aluno a3 = new Aluno("Luciana", 3454);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println(String.format("O aluno %2$s ou  %1$s está matriculado?", a1.getNome(), a2.getNome()));

        if (javaColecoes.estaMatriculado(a1) & javaColecoes.estaMatriculado(a2)) {
            System.out.println("Sim.");
        } else {
            System.out.println("Não");
        }

        Aluno a4 = new Aluno("Márcia", 1234);

        System.out.println(a1.equals(a4));
        System.out.println(javaColecoes.estaMatriculado(a4));
        System.out.println(javaColecoes.estaMatriculado(a1));

        // ------------

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

    }
}
