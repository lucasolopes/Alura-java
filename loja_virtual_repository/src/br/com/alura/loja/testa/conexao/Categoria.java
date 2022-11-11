package br.com.alura.loja.testa.conexao;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private Integer id;
	private String nome;
	private List<Produto1> produtos = new ArrayList<Produto1>();
	
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void adicionar(Produto1 produto) {
		produtos.add(produto);
			
	}

	public List<Produto1> getProdutos() {
		// TODO Auto-generated method stub
		return produtos;
	}
}
