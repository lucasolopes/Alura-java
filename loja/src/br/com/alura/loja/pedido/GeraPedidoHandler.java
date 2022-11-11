package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acoes.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	private List<AcaoAposGerarPedido> acaoesAposGerarPedidos;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acaoesAcaoAposGerarPedidos) {
		acaoesAposGerarPedidos = acaoesAcaoAposGerarPedidos;
	}
	
	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		this.acaoesAposGerarPedidos.forEach(a -> a.executarAcao(pedido));
	}
}
