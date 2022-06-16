package Classes;

public class Cartao {

	private int qtdCompras;
	private double compraTotal;

	public void DecimoPremiado(double compra) {
		this.qtdCompras += 1;
		this.compraTotal += compra;
		if (qtdCompras == 2) {
			this.compraTotal = compraTotal / qtdCompras;
		}
	}

	public double verificarPremio() {
		if (qtdCompras == 2) {

			System.out.println("--------------------PARABÊNS--------------------------");
			System.out.println("--------------------PARABÊNS--------------------------");
			System.out.println("--------------------PARABÊNS--------------------------");
			System.out.println("--------------------PARABÊNS--------------------------");
			System.out.println("--------------------PARABÊNS--------------------------");
			System.out.println("--------------------PARABÊNS--------------------------");
			System.out.println("------------------------------------------------------");
			System.out.print(" Seu Decimo Premiado foi ativado, e sua proxima compra "
					+ "é gratis compra no valor de até " + compraTotal + " $");
			System.out.println("");
			return compraTotal;
		}
		return 0;

	}

}
