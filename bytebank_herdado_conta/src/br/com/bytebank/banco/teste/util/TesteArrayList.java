package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc= new ContaCorrente(22, 11);		
		lista.add(cc);
		
		Conta cp= new ContaPoupanca(22, 22);		
		lista.add(cp);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc2= new ContaCorrente(33, 311);		
		lista.add(cc2);
		
		Conta cp2= new ContaPoupanca(322, 322);		
		lista.add(cp2);
		
		for(int i = 0; i< lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("---------------");
		for(Object o : lista) {
			System.out.println(o);
		}
		
		
		
		
	}

}
