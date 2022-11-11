package bytebank_herdado;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		SistemaInterno si = new SistemaInterno();
		si.autentica(g,2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(1234);
		si.autentica(cliente, 1244);
		
		Administrador a = new Administrador();
		a.setSenha(33333);
		si.autentica(a,33333);
	}
}
