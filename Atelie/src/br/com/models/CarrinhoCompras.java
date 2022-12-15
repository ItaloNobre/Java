package br.com.models;

import java.util.ArrayList;
import java.util.Scanner;

public class CarrinhoCompras {

	ArrayList<Produto> produtos;
	ArrayList<Produto> carrinho;
	Scanner input = new Scanner(System.in);

	public CarrinhoCompras() {

		this.carrinho = new ArrayList<Produto>();
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean decrementarProduto() {
		System.out.println("digite o numero do produto que você deseja retirar do carrinho");
		String nome = input.next();
		for (Produto produto : produtos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				carrinho.remove(produto);
				System.out.println("Produto removido com sucesso!");
				return true;
			} 
		}
		System.out.println("Produto nao consta na sua lista para ser removido");
		return false;

	}

	public boolean incrementarProduto() {
		System.out.println("digite o nome do produto que você deseja adicionar no carrinho");
		String nome = input.next();

		for (Produto produto : produtos) {
			if (produto.getNome().equalsIgnoreCase(nome)) {
				carrinho.add(produto);
				System.out.println("Produto adicionado com sucesso!");
				return true;
			} 
			
		}
		System.out.println("produto nao existe no catalogo!");
		return false;
	}
	

	public boolean listarCompra() {
		System.out.println("----------TELA DE CARRINHO DE COMPRAS------------");
		for (Produto produto : carrinho) {
			System.out.println(produto.toString());
		}
		System.out.println("-------------------------------------------------");
		return true;
	}

	public boolean finalizarCompra() {
		System.out.println("Lista De Produtos Comprados");
		for (Produto produto : produtos) {
			for (Produto produtoComprado : carrinho) {
				if (produtoComprado == produto)
					produto.setQtdEstoque(produtoComprado.getQtdEstoque() - 1);

			}
		}
		System.out.println("--------------------------------");
		System.out.println("Compra finalizada com sucesso!");
		System.out.println("Obrigado e Volte sempre!");
		System.out.println("--------------------------------");
		return true;
		
	}

}
