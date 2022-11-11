package bytebank_herdado;

public class SistemaInterno {

	public void autentica(Autenticavel g, int senha) {
		boolean autenticou = g.autentica(senha);
		if (autenticou)
			System.out.println("Pode entrar no Sistema");
		else
			System.out.println("Nao pode entrar no Sistema");
	}
}
