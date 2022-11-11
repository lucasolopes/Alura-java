package br.com.alura.loja.testa.conexao;

public class Produto1 {

	private Integer id;
	private String nome;
	private String descricao;

	public Produto1(Integer id,String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	

	public Produto1(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	


	
	public String getNome() { 
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("o produto é: %d, %s, %s", this.id, this.nome, this.descricao);
	}
	
	

}
