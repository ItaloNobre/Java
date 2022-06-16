package Classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.sql.RowSetInternal;

public class Login {

	Scanner input = new Scanner(System.in);
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public void login() {

		int opcao = 0;

		do {
			System.out.println("------------BEM VINDO AO APP DELIVEY PREMIADO------------");
			System.out.println("");
			System.out.println("Digite - 1 para Fazer Cadastro");
			System.out.println("Digite - 2 para fazer Login");
			System.out.println("");
			System.out.println("---------------------------------------------------------");
			int escolha = input.nextInt();

			if (escolha == 1) {

				System.out.println("-----------------TELA DE CADASTRO-----------------");
				System.out.println("Digite um Login para cadastrar No App");
				String nome = input.next();
				System.out.println("Digite uma Senha para cadastrar No App");
				String senha = input.next();
				System.out.println("Cadastrado com Sucesso !");
				clientes.add(new Cliente(nome, senha));
				System.out.println("--------------------------------------------------");

			} else if (escolha == 2) {

				System.out.println("-----------------TELA DE LOGIN--------------------");
				System.out.println("Digite o Login: ");
				String nome = input.next();
				System.out.println("Digite a Senha");
				String senha = input.next();

				for (Cliente ap : clientes) {

					if (ap.getCliente().equalsIgnoreCase(nome) && ap.getSenha().equalsIgnoreCase(senha)) {

						System.out.println("Login realizado com sucesso!");
						System.out.println("---------------------------------------------------");
						opcao = 1;
						ap.telaInicial();
						login();
						break;
					}
				}

			} else {
				System.out.println("Opcao invalida, tente de novo!");
			}
		} while (!(opcao == 1));
	}

}
