package br.com.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Atelie {

	Produto produto;
	StrategyCalculo strategyCalculo;
	Scanner in = new Scanner(System.in);
	Scanner in2 = new Scanner(System.in);
	Catalogo catalogo = new Catalogo();
	CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
	ArrayList<Produto> produtos = new ArrayList<>();

	public boolean cadastrarProduto() {
		System.out.println("----------TELA DE CADASTRO DE PRODUTOS-----------");
		System.out.println("Digite o nome do Produto:");
		String nome = in.next();
		System.out.println("Digite o Preço de Custo:");
		Double preco = in2.nextDouble();
		System.out.println("Digite a quantidade de Unidades:");
		int estoque = in2.nextInt();
		System.out.println("Digite a Categoria do Produto:");
		String categoria = in.next();
		System.out.println();
		System.out.println("Digite 1 - para lucro de 100%");
		System.out.println("Digite 2 - para lucro de 50%");
		System.out.println("Digite 3 - para lucro de 20%");
		int escolha = in.nextInt();
		switch (escolha) {
		case 1:
			strategyCalculo = new StrategyLucroAlto();
			break;
		case 2:
			strategyCalculo = new StrategyLucroPequeno();
			break;
		case 3:
			strategyCalculo = new StrategyLucroPequeno();
			break;
		default:
			strategyCalculo = new StrategyLucroAlto();
		}

		produto = new Produto(nome, preco, estoque, categoria,strategyCalculo);
		double strategy = produto.calcularPrecoFinal();
		produto.setPrecoFinal(strategy);
		produtos.add(produto);
		catalogo.setProdutos(produtos);
		carrinhoCompras.setProdutos(produtos);

		System.out.println("Produto cadastrado com sucesso");
		return true;
	}

	public ArrayList<Produto> produtos() {
		return produtos;
	}

}
