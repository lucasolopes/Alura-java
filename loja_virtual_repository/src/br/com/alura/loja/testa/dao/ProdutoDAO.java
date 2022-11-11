package br.com.alura.loja.testa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.testa.conexao.Categoria;

import br.com.alura.loja.testa.conexao.Produto1;

public class ProdutoDAO {
	
	private Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void salvar(Produto1 produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES(?, ?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			
			pstm.execute();
			
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					produto.setId(rst.getInt(1));
				}
			}
			
		}
	}
	
	public List<Produto1> listar() throws SQLException{
		List<Produto1> produtos = new ArrayList<Produto1>();
		String sql  = "SELECT ID, NOME, DESCRICAO FROM PRODUTO";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Produto1 produto = new Produto1(rst.getInt(1), rst.getString(2), rst.getString(3));
					
					produtos.add(produto);
				}
			}
		}
		return produtos;
		
		
	}

	public List<Produto1> buscar(Categoria ct) throws SQLException {
		
		List<Produto1> produtos = new ArrayList<Produto1>();
		
		System.out.println("EXECUTANDO a query de buscar por categoria.");
		
		String sql  = "SELECT ID, NOME, DESCRICAO FROM PRODUTO WHERE CATEGORIA_ID = ?";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.setInt(1, ct.getId());
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Produto1 produto = new Produto1(rst.getInt(1), rst.getString(2), rst.getString(3));
					
					produtos.add(produto);
				}
			}
		}
		return produtos;
	
	}
	
	
	
}
