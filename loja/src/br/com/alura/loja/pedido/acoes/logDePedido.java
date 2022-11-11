package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class logDePedido implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		// TODO Auto-generated method stub
		System.out.println("pedido gerado : "+ pedido);
	}
	
}
