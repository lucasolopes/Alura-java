package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; 
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
	}
}
