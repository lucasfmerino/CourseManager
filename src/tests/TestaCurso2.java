package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.Aula;
import models.Curso;

public class TestaCurso2 {
        public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções", "Lucas");

        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Classe", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
    
}
