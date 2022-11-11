package java_pilha;

public class TesteConexao {
	public static void main(String[] args) {
		
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("erro conexao");
		}
		
		
		//-------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			}finally{
//				if(con!= null)
//					con.close();
//			} 
	}
}
