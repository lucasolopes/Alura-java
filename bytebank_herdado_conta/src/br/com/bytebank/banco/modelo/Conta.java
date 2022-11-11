package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 *	Classe representa a moldura de uma conta
 * 	
 *  @author Lucas Olopes
 */




public abstract class Conta extends Object implements Comparable<Conta> , Serializable{
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
    private static int total;
    
    /** 
     *  
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     * @param agencia
     * @param numero
     */
	public Conta(int agencia, int numero) {
			Conta.total++;
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
	
	public abstract void deposita(double valor);
	
	
	/**
	 * 
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor || !positivo(valor)) {
			throw new SaldoInsuficienteException("Saldo Insuficiente ou Valor Negativo= valor: " + valor + " Saldo: "+ this.saldo);
		}
		this.saldo -= valor;
			
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
		
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
	
    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if(this.agencia != outra.agencia) {
            return false;
        }
        if(this.numero != outra.numero) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public int compareTo(Conta outro) {
    	return Double.compare(this.saldo, outro.saldo);
    }
	

	 @Override
	 public String toString() {
		 return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo; 
	 }
	
	
}
