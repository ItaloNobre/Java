package br.com.models;

public class Produto {

	private String nome;
	private double preco;
	private int qtdEstoque;
	private String categoria;
	private double precoFinal;

	private StrategyCalculo strategyDeCalculo;

	public Produto(String nome, double preco, int qtdEstoque, String categoria,StrategyCalculo strategyDeCalculo) {

		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
		this.strategyDeCalculo = strategyDeCalculo;
	}

	public double calcularPrecoFinal() {
		this.precoFinal = strategyDeCalculo.calcularLucro(this.preco);
		double a = strategyDeCalculo.calcularLucro(this.preco);
		return a;

	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public StrategyCalculo getStrategyDeCalculo() {
		return strategyDeCalculo;
	}

	public void setStrategyDeCalculo(StrategyCalculo strategyDeCalculo) {
		this.strategyDeCalculo = strategyDeCalculo;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + ", categoria=" + categoria
				+ ", precoFinal=" + precoFinal + "]";
	}

}
