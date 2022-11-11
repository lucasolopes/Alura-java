package br.com.alura.loja.testa.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.loja.testa.dao.CategoriaDAO;

public class TestaListagemDeCategorias {
	public static void main(String[] args) throws SQLException {
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategoria = categoriaDAO.listarComProdutos();
			listaDeCategoria.stream().forEach(ct -> {
				System.out.println(ct.getNome());

				for(Produto1 produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - "+ produto.getNome());
				}
			});
		}
		
	}
}
