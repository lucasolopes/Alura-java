package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50.0);
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 150;
		contaDoJoao.deposita(50);
		

		if (contaDoPaulo.saca(50))
			System.out.println(contaDoPaulo.saldo);
		else
			System.out.println("saldo insuficiente!");
		

		if (contaDoPaulo.transfere(100, contaDoJoao)) {
			System.out.println("transferencia feita com sucesso!");
		}else {
			System.out.println("Saldo Insuficiente!");
		}
		
		System.out.println("Saldo Paulo "+contaDoPaulo.saldo);
		System.out.println("Saldo Joao "+contaDoJoao.saldo);
		
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
	}
}
