package br.com.alura.loja.orcamento.situacao;


import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser reprovado");
	}
	
	public void finalizado(Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser finalizado");
	}
}