
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
			System.out.println("Seu carro � um Chevtrolet");

		} else if (fiat.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Fiat");

		} else if (toyota.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Toyota");

		} else if (volkswagen.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Volkswagen");

		} else if (ford.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Ford");

		}else {
			System.out.println("Esse veiculo n�o consta na nossa Base de Dados");
		}
		return false;
	}
        
        public String returnTela(String carro){
            if (chevrolet.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Chevtrolet");

		} else if (fiat.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Fiat");

		} else if (toyota.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Toyota");

		} else if (volkswagen.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Volkswagen");

		} else if (ford.buscarNomeMontadora(carro) == true) {
			System.out.println("Seu carro � um Ford");

		}else {
			System.out.println("Esse veiculo n�o consta na nossa Base de Dados");
		}
            return null;
        }
}


