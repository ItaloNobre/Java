
package ListaDeMondadoras;

/**
 *
 * @author italo
 */
public class Chevrolet implements PadraoMontadoras {

	@Override
	public boolean buscarNomeMontadora(String carro) {

		String[] listaCarro = { "prisma", "onix", "cobalt", "montana", "s10", "malibu", "celta", "onixplus", "cruze" };
		for (int i = 0; i < listaCarro.length; i++) {
			if (carro.equalsIgnoreCase(listaCarro[i])) {

				return true;
			}

		}
		return false;

	}

}

