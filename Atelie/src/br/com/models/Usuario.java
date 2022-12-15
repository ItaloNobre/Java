package br.com.models;

import java.util.Scanner;

public class Usuario {

	private String name;
	private String email;
	private String senha;
	Scanner input2 = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void realizarCompra(Atelie atelie) {
		boolean menu = true;
		while (menu) {
			System.out.println("------------------TELA DE COMPRA----------------");
			System.out.println("Digite 1 - para adicionar produto no carrinho");
			System.out.println("Digite 2 - para retirar produto do carrinho");
			System.out.println("Digite 3 - ver carrinho");
			System.out.println("Digite 4 - finalizar compra");
			System.out.println("Digite 5 - para sair");
			System.out.println("-------------------------------------------------");

			int escolha = input2.nextInt();

			switch (escolha) {
			case 1:
				atelie.carrinhoCompras.incrementarProduto();
				break;
			case 2:
				atelie.carrinhoCompras.decrementarProduto();
				break;
			case 3:
				atelie.carrinhoCompras.listarCompra();

				break;
			case 4:
				atelie.carrinhoCompras.finalizarCompra();
				menu = false;
				break;
			case 5:
				menu = false;
				break;

			default:
				break;
			}

		}

	}
}
