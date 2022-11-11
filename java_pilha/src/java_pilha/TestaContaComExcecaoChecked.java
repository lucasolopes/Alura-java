package java_pilha;

public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			System.out.println("tratamento ....");
		}
	}
}
