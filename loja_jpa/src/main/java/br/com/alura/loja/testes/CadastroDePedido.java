package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ClienteDao;
import br.com.alura.loja.dao.PedidoDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Cliente;
import br.com.alura.loja.modelo.ItemPedido;
import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUTIL;
import br.com.alura.loja.vo.RelatorioDeVendasVo;

public class CadastroDePedido {

	public static void main(String[] args) {
		popularBancoDeDados();
		
		EntityManager em = JPAUTIL.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		ClienteDao clienteDao = new ClienteDao(em); 
		Produto produto = produtoDao.buscarPorId(1l);
		Produto produto2 = produtoDao.buscarPorId(2l);
		Produto produto3 = produtoDao.buscarPorId(3l);
		
		Cliente cliente = clienteDao.buscarPorId(1l);
		
		em.getTransaction().begin();
		
		Pedido pedido = new Pedido(cliente );
		
		pedido.adicionarItem(new ItemPedido(10, pedido, produto));
		pedido.adicionarItem(new ItemPedido(40, pedido, produto2));
		pedido.adicionarItem(new ItemPedido(2, pedido, produto3));
		
		PedidoDao pedidoDao = new PedidoDao(em);
		pedidoDao.cadastrar(pedido);
		
		
		
		em.getTransaction().commit();
		
		BigDecimal totalVendido = pedidoDao.valorTotalVendido();
		System.out.println("Valor total:" + totalVendido);
		List<RelatorioDeVendasVo> relatorio = pedidoDao.relatorioDeVendas();
		
		relatorio.forEach(System.out::println);
		em.close();
	}
	
	
	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");
		
		
		Produto celular = new Produto("Xiaomi Redmi","Muito Legal",new BigDecimal("800"),celulares);
		Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("4000"), videogames);
		Produto macbook = new Produto("Macbook", "Mac Book pro M1", new BigDecimal("4000"), informatica);

		Cliente cliente = new Cliente("Rodrigo", "123456");

		
		EntityManager em = JPAUTIL.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ClienteDao clienteDao = new ClienteDao(em); 
		
		
		em.getTransaction().begin();
		
		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(videogames);
		categoriaDao.cadastrar(informatica);
		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(videogame);
		produtoDao.cadastrar(macbook);
		clienteDao.cadastrar(cliente);
		
		em.getTransaction().commit();
		
		em.close();
	
	}

}
