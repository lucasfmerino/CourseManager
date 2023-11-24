package tests;

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
    }
}
