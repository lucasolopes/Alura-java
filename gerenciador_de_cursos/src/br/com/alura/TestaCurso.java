package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 23));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		//System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		//Collections.sort(aulas);
		
		System.out.println(aulas );
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		
		//System.out.println(javaColecoes.getAulas());
	}
}
