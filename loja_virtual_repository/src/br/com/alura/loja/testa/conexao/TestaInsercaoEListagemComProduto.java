package br.com.alura.loja.testa.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.loja.testa.dao.ProdutoDAO;

public class TestaInsercaoEListagemComProduto {
	public static void main(String[] args) throws SQLException {
		Produto1 comoda = new Produto1("Comoda", "Comada Vertical");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			produtoDAO.salvar(comoda);
			List<Produto1> listaDeProdutos = produtoDAO.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
	}
}
