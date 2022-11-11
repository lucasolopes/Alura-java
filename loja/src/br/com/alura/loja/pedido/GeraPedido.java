package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeIntens;
	
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeIntens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeIntens = quantidadeIntens;
	}
	
	public void executa() {

		Orcamento orcamento = new Orcamento(/*this.valorOrcamento, this.quantidadeIntens*/);
		orcamento.adicionarItem(new ItemOrcamento(this.valorOrcamento));
		
		
		Pedido pedido = new Pedido(getCliente(),  LocalDateTime.now(), orcamento);
		
		System.out.println("Salvar pedido no banco de dados");
		System.out.println("enviar email com dados do novo pedido");
	}

	public String getCliente() {
		return cliente;
	}
	
}
