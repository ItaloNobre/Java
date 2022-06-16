package Classes;

import java.util.Scanner;

import Herança.Interface;

public class FatPizza {
	
	double pizzaPequena = 25.00;
	double pizzaGrande = 50.00;
	double pizzaFamilia = 75.00;
	private int qtda;
	

	public double vender() {
		
		System.out.println("--------------PIZZARIA--------------------");
		System.out.println("Digite 1 para Pizza Pequena - PREÇO: $25");
		System.out.println("Digite 2 para Pizza Grande - PREÇO: $50");
		System.out.println("Digite 3 para Pizza Familia - PREÇO: $75");
		System.out.println("------------------------------------------");
		
		System.out.println("Escolha seu lanche");
		Scanner input = new Scanner(System.in);
		String escolha = input.next();
		
		switch (escolha) {
		case "1":
			System.out.println("Quantas pizzas deseja");
			qtda = input.nextInt();
			
			return pizzaPequena * qtda;
			
			
		case "2":
			System.out.println("Quantas pizzas deseja");
			qtda = input.nextInt();
			return pizzaGrande * qtda;
			
		case "3":
			System.out.println("Quantas pizzas deseja");
			qtda = input.nextInt();
			
			return pizzaFamilia * qtda;
			
			
			
			

		default:
			System.out.println("Opção invalida!");
			return 0;
		
		
		
		}
	}
}
