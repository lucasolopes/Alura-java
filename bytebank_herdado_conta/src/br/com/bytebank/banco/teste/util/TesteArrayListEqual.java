package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEqual {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta cc= new ContaCorrente(22, 11);		
		lista.add(cc);
		
		Conta cp= new ContaPoupanca(22, 22);		
		lista.add(cp);
		
		Conta cp2= new ContaPoupanca(22, 22);		

		
		boolean existe =   lista.contains(cp2);
		System.out.println("Ja existe? "+existe);
		
		
		for(Object conta : lista) {
			System.out.println(conta);
		}

	}

}
