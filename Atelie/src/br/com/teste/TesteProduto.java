package br.com.teste;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.models.Atelie;
import br.com.models.Produto;
import br.com.models.StrategyCalculo;
import br.com.models.StrategyLucroPequeno;

class TesteProduto {
	
	
	@Test
	void TesteCadasTrarPrecoFinal() {
		StrategyCalculo calculo = new StrategyLucroPequeno();
		Produto produto = new Produto("vela",10,10,"igreja",calculo);
		produto.setStrategyDeCalculo(calculo);
		double valorEsperado = 12;
		double valorTest = produto.calcularPrecoFinal();
		assertEquals(valorEsperado, valorTest);;
	}
}
