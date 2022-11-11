package br.com.alura.loja.testa.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestaInsercaoComParametro {
	public static void main(String[] args) throws SQLException {

		
		ConnectionFactory criaConexao = new ConnectionFactory();
		try( Connection connection = criaConexao.recuperarConexao()){
			connection.setAutoCommit(false);
			
			try ( 
					PreparedStatement stm =  
					connection.prepareStatement("INSERT INTO PRODUTO (nome,descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)
			){
				adicionarVariavel("SmartTV", "45 polegadas", stm);
				adicionarVariavel("Radio", "Radio de bateria", stm);
				
				connection.commit();
				
				stm.close();
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				connection.rollback();
			}
		}
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		if(nome.equals("Radio"))
		throw new RuntimeException("nao foi possivel add o produto");
		stm.execute();
		
		try(ResultSet rst = stm.getGeneratedKeys())
		{
			while(rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O id criado foi: " + id);
			}
		}
	}
}
