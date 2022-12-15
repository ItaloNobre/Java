package br.com.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.models.Atelie;
import br.com.models.CarrinhoCompras;
import br.com.models.Produto;
import br.com.models.StrategyCalculo;
import br.com.models.StrategyLucroPequeno;
import br.com.models.Usuario;

class TesteCarrinhoCompras {
	
	//Está faltando alguns metodos que não foram testados pois os mesmos são do tipo
	//voide e não tem retorno para testar.
	
	@Test
	void TesteIncrementarProduto() { 
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		ArrayList<Produto> produtos = new ArrayList<>();
		StrategyCalculo strategy = new StrategyLucroPequeno();
		Produto produto = new Produto("vela", 100, 10, "igreja",strategy);
		produtos.add(produto);
		carrinhoCompras.setProdutos(produtos);
		
		Assertions.assertEquals(true,carrinhoCompras.incrementarProduto());
	}
	
	@Test
	void TesteDecrementarProduto() {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		ArrayList<Produto> produtos = new ArrayList<>();
		StrategyCalculo strategy = new StrategyLucroPequeno();
		Produto produto = new Produto("vela", 100, 10, "igreja",strategy);
		produtos.add(produto);
		carrinhoCompras.setProdutos(produtos);
		
		
		Assertions.assertEquals(true,carrinhoCompras.decrementarProduto());
	}// o nome do produto que está cadastrado é vela
	
}
