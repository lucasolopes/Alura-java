package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];
		
		ContaCorrente cc1= new ContaCorrente(22,11);
		referencias[0]=cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(33, 12);
		referencias[1]=cc2;
		
		
//		Cliente cliente = new Cliente();
//		contas[2] = cliente;
//		
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());
		//System.out.println(referencias[0].getNumero());
	}

}
