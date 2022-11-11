package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso{
	private String nome;
	private String instrutor;
	int tempoTotal = 0;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	 private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal()+ ", aulas: "+ this.aulas + "]";	
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	
	
	public Aluno buscaMatricula(int numero) {
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("matricula nao exite");
		return matriculaParaAluno.get(numero);
	}

	
}
