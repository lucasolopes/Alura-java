package bytebank_encapsulado;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
    private static int total;
	public Conta(int agencia, int numero) {
			Conta.total++;
			System.out.println("total é :"+Conta.total);
			this.agencia = agencia;
			this.numero = numero;
		
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	private boolean positivo(double valor) {
		if (valor > 0)
			return true;
		return false;
	}
	
	public void deposita(double valor) {
		if (positivo(valor))
			this.saldo += valor;
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor && positivo(valor)) {
			this.saldo -= valor;
			return true;
		}
		return false;	
	}
	
	public boolean transfere(double valor, Conta destino){
		if (this.saldo >= valor && positivo(valor)) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;	
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(positivo(numero))
			this.numero = numero;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (positivo(agencia))
			this.agencia = agencia;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	 
	
	
}
