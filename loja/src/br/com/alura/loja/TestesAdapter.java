package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpCliente;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orcamento = new Orcamento(/*BigDecimal.TEN,1*/);
		orcamento.adicionarItem(new ItemOrcamento(BigDecimal.TEN));
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
		registro.registrar(orcamento);
		
		
	}

}
