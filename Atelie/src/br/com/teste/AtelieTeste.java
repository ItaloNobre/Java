package br.com.teste;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.com.models.Atelie;
import br.com.models.Produto;

class AtelieTeste {
	Atelie atelie = new Atelie();
	
	
	@Test
	void testeCadastrarProduto() {
		
		assertTrue(atelie.cadastrarProduto());
		
	}

}
