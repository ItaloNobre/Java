package Classes;

import java.util.Scanner;

public class Cliente {

	private String cliente;
	private String senha;
	private double compra;
	private double saldo;
	Cartao cartao = new Cartao();

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	Scanner input = new Scanner(System.in);

	public Cliente(String cliente, String senha) {

		this.cliente = cliente;
		this.senha = senha;
	}

	public void telaInicial() {
		int escolha = 0;
		System.out.println("");
		System.out.println("--------------------------TELA INICIAL----------------------");
		System.out.println("Bem Vindo ao APP TambémQueroDelivery");
		System.out.println("temos 2 parceiros Cadastrados");
		System.out.println("Digite 1 pra escolher - FatPizza");
		System.out.println("Digite 2 pra escolher - BurguerField");
		System.out.println("Digite 3 pra escolher - Ailton");
		System.out.println("------------------------------------------------------------");
		escolha = input.nextInt();

		comprar(escolha);

	}

	public void comprar(int escolha) {

		int escolha1 = escolha;
		int condicao = 1;

		if (escolha1 == 1) {
			FatPizza fatPizza = new FatPizza();
			this.compra += fatPizza.vender();
			cartao.DecimoPremiado(compra);
			escolha = 0;

		} else if (escolha1 == 2) {
			BurguerField lanchonete = new BurguerField();
			this.compra += lanchonete.vender();
			cartao.DecimoPremiado(compra);
			escolha1 = 0;

		} else if (escolha1 == 3) {
			Ailton conveniencia = new Ailton();
			this.compra += conveniencia.vender();
			cartao.DecimoPremiado(compra);
			escolha1 = 0;

		}

		System.out.println("Quer continuar comprando?");
		System.out.println("digite 1 para continuar");
		System.out.println("digite 2 para finalizar as compras e pagar");
		condicao = input.nextInt();
		if (condicao == 1) {
			telaInicial();

		} else if (condicao == 2) {
			pagar();

		}

	}

	public void pagar() {

		int opcao = 0;
		while (!(opcao == 1 || opcao == 2)) {

			if (this.compra > 0) {
				System.out.println("-----------------TELA DE PAGAMENTO------------------------");
				System.out.println("Sua conta deu: " + this.compra + "$");
				System.out.println("Efetuar pagamento: 1 - SIM 2- NAO");
				opcao = input.nextInt();
				if (opcao == 1) {
					System.out.println("Pagamento realizado com Sucesso");
					System.out.println("Agora é so aguardar seu pedido chegar");
					System.out.println("Obrigado e volte sempre!");

					if (saldo > 0) {
						this.compra -= saldo;
						if (compra > 0) {
							System.out.println("Ainda resta um debito de:" + this.compra + " $");
							System.out.println("Efetuar pagamento: 1 - SIM 2- NAO");
							int pagamentoExtra = input.nextInt();
							System.out.println("Obrigado e Volte Sempre");

						}
					} else {
						this.compra = 0;
					}
					// cartao.verificarPremio();
					System.out.println("--------------------------------------------------------");
					if (cartao.verificarPremio() > 0) {
						System.out.println("ESCOLHA COM SABEDORIA!");
						saldo = cartao.verificarPremio();
						telaInicial();
					}

				} else if (opcao == 2) {
					opcao = 0;
					while (!(opcao == 1 || opcao == 2)) {
						System.out.println("-------------------TELA DE CANCELAMENTO--------------------");
						System.out.println("Digite 1 - para cancelar");
						System.out.println("Digite 2 - para retornar as compras");
						int opcao2 = input.nextInt();
						if (opcao2 == 1) {
							System.out.println("Compras Canceladas!");
							this.compra = 0;
							telaInicial();
							System.out.println("-----------------------------------------------------------");
						} else if (opcao2 == 2) {
							telaInicial();
						}
					}
				}

			} else {
				System.out.println("Voce nao tem nenhum produto na Sacola");
			}
		}
	}

}
