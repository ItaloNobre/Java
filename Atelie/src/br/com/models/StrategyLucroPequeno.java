package br.com.models;

public class StrategyLucroPequeno implements StrategyCalculo {

	private final double lucro = 0.2;

	@Override
	public double calcularLucro(double preco) {
		
		return preco + preco * lucro;
	}

}
