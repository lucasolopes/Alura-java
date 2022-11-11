package br.com.alura;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 23));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche",17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os matriculados: " );
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		Aluno rodrigo = new Aluno("Rodrigo Turini", 34672);
		System.out.println(javaColecoes.estaMatriculado(rodrigo));

	}
}
