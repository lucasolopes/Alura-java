package bytebank__composto;

public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		if (conta.saca(10)) {
			System.out.println("novo saldo: "+ conta.getSaldo());
		}else {
			System.out.println("Nao Efetuado, Saldo Insuficiente!");
		}
	}
}
