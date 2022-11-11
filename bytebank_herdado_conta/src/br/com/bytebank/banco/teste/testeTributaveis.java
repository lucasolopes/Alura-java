package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;
/**
 * Classe que representa um cliente no Bytebank.
 * 
 * 
 * @author Lucas Olopes
 * @version 0.1
 */
public class testeTributaveis {

	public static void main(String[] args) {
		ContaCorrente  cc = new ContaCorrente(222,333);
		cc.deposita(100);
		
		
		SeguroDeVida  seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
