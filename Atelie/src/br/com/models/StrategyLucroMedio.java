package br.com.models;

public class StrategyLucroMedio implements StrategyCalculo {

	private final double lucro = 0.5;

	@Override
	public double calcularLucro(double preco) {
		
		return preco + preco * lucro;
	}

}
