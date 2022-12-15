package br.com.models;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Produto> produtos;

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public boolean exibirProdutos() {
		System.out.println("--------LISTA DE PRODUTOS NO CATALOGO------------");
		for (Produto produto : produtos) {
			System.out.println(" [Nome: " + produto.getNome() + " Preço: " + produto.getPrecoFinal() + " Quantidade: "
					+ produto.getQtdEstoque() + "]");

		}
		System.out.println("-------------------------------------------------");
		return true;
	}

}
