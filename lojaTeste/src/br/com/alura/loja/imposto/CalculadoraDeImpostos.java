package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos extends calculadora {
	@Override
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

	@Override
	public BigDecimal calcular() {
		// TODO Auto-generated method stub
		return null;
	}

}
