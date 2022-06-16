
package ListaDeMondadoras;

public class Montadora implements PadraoMontadoras {

	Fiat fiat = new Fiat();
	Chevrolet chevrolet = new Chevrolet();
	Toyota toyota = new Toyota();
	Volkswagen volkswagen = new Volkswagen();
	Ford ford = new Ford();

	@Override
	public boolean buscarNomeMontadora(String carro) {

		if (chevrolet.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Chevtrolet");

		} else if (fiat.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Fiat");

		} else if (toyota.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Toyota");

		} else if (volkswagen.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Volkswagen");

		} else if (ford.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Ford");

		}else {
			System.out.println("Esse veiculo não consta na nossa Base de Dados");
		}
		return false;
	}
        
        public String returnTela(String carro){
            if (chevrolet.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Chevtrolet");

		} else if (fiat.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Fiat");

		} else if (toyota.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Toyota");

		} else if (volkswagen.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Volkswagen");

		} else if (ford.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro é um Ford");

		}else {
			System.out.println("Esse veiculo não consta na nossa Base de Dados");
		}
            return null;
        }
}


