package example;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String class1 = "Conhecendo mais de listas";
        String class2 = "Modelando a classe Aula";
        String class3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(class1);
        aulas.add(class2);
        aulas.add(class3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        System.out.println(aulas.size());

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula: " + aula);
            System.out.println();
        });

        aulas.add("Aumentano noss conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);
    }
}
