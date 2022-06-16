package Classes;

import java.util.Scanner;

public class Ailton {

	private double refrigeranteP = 5.00;
	private double refrigeranteM = 7.00;
	private double refrigeranteG = 10.00;
	private double cerveja = 5.00;
	private int qtda;

	public double vender() {

		System.out.println("--------------AILTON--------------------");
		System.out.println("Digite 1 para Refrigerante 500ml - PREÇO: $5 ");
		System.out.println("Digite 2 para Refrigerante 1L - PREÇO: $7");
		System.out.println("Digite 3 para Refrigerante 2L- PREÇO: $10");
		System.out.println("Digite 3 para Cerveja Longnet- PREÇO: $5");
		System.out.println("----------------------------------------");

		System.out.println("Escolha seu lanche");
		Scanner input = new Scanner(System.in);
		String escolha = input.next();

		switch (escolha) {
		case "1":
			System.out.println("Quantos refrigerantes de 500ml deseja:");
			qtda = input.nextInt();

			return refrigeranteP * qtda;

		case "2":
			System.out.println("Quantos refrigerantes de 1L deseja:");
			qtda = input.nextInt();
			return refrigeranteM * qtda;

		case "3":
			System.out.println("Quantos refrigerantes de 2L deseja:");
			qtda = input.nextInt();

			return refrigeranteG * qtda;

		case "4":
			System.out.println("Quantas Cervejas deseja:");
			qtda = input.nextInt();

			return cerveja * qtda;

		default:
			System.out.println("Opção invalida!");
			return 0;

		}
	}

}
