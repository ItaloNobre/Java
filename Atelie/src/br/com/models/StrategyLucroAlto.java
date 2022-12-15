package br.com.models;

public class StrategyLucroAlto implements StrategyCalculo {

	private final int lucro = 2;

	@Override
	public double calcularLucro(double preco) {

		return preco * lucro;
	}

}
