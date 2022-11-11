package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(/*new BigDecimal("100"),1*/);
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

		System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));

	}
}
