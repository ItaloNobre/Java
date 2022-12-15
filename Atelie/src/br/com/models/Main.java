package br.com.models;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Atelie atelie = new Atelie();
		int escolha = 0;

		while (escolha != 3) {

			Scanner in = new Scanner(System.in);
			System.out.println("----------------ATELIÊ DA DANI ---------------\n");
			System.out.println("---------------Tela de Login-----------");
			System.out.println("Digite 1 - Se você for Funcionario");
			System.out.println("Digite 2 - Se você for Cliente");
			System.out.println("Digite 3 - Para Sair");
			System.out.println("---------------------------------------");
			escolha = in.nextInt();
			if (escolha == 1) {
				boolean escolha1 = atelie.cadastrarProduto();
			} else if (escolha == 2) {
				Usuario usuario = new Usuario();
				try {
				usuario.realizarCompra(atelie);
				} catch (Exception e) {
					System.out.println("nenhum produto cadastrado pra venda!");
				}

			}

		}
	}

}
