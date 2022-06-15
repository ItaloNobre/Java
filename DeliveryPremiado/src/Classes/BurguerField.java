package Classes;

import java.util.Scanner;

public class BurguerField {

	String nomeEstabelecimento;

	double burguer = 20.00;
	double bacon = 25.00;
	double batataFrita = 15.00;
	int qtda;

	public int acumulaPontos() {

		return 1;

	}

	public double vender() {

		System.out.println("--------------SEJA BEM VINDO A LANCHONETE DA MARIA--------------------");
		System.out.println("Digite 1 para X-Burguer - PREÇO: $20");
		System.out.println("Digite 2 para X-Bacon - PREÇO: $25");
		System.out.println("Digite 3 para Batata Frita - PREÇO: $15");
		System.out.println("----------------------------------------------------------------------");

		System.out.println("Escolha seu lanche");
		Scanner input = new Scanner(System.in);
		String escolha = input.next();
		switch (escolha) {

		case "1":
			System.out.println("Quantas unidades deseja");
			qtda = input.nextInt();

			return burguer * qtda;

		case "2":
			System.out.println("Quantas unidades deseja");
			qtda = input.nextInt();

			return bacon * qtda;

		case "3":
			System.out.println("Quantas unidades deseja");
			qtda = input.nextInt();
			return batataFrita * qtda;

		default:
			System.out.println("Opção invalida!");
			return 0;

		}

	}

}
