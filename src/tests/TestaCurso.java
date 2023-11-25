package tests;

import models.Aula;
import models.Curso;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções", "Lucas");

        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Classe", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

        System.out.println(javaColecoes.getAulas());

    }
}
