package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Curso
 */
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    // private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculas = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {

        // int tempoTotal = 0;
        // for (Aula aula : aulas) {
        // tempoTotal += aula.getTempo();
        // }
        // return tempoTotal;

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculas.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatricula(int matricula) {
        // for (Aluno aluno: alunos) {
        // if(aluno.getNumeroMatricula() == matricula)
        // return aluno;
        // throw new NoSuchElementException("Matricula não encontrada" + matricula);
        if (!matriculas.containsKey(matricula))
            throw new NoSuchElementException();
        return matriculas.get(matricula);
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", Tempo Total: " + this.getTempoTotal() + " min, aulas: " + this.getAulas() + "]";
    }
}
