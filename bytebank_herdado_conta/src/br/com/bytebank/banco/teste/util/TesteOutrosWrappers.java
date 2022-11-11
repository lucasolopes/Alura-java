package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		
		Boolean bref = Boolean.TRUE;
		System.out.println(bref.booleanValue());
		
		Number numero = Integer.valueOf(29);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.2);
		lista.add(45.6f);
		
		
	}
}
