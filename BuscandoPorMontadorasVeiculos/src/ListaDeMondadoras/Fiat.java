/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeMondadoras;

public class Fiat implements PadraoMontadoras {



	@Override
	public boolean buscarNomeMontadora(String carro) {

		String[] listaCarro = { "palio", "uno","pulse","strada","toro","cronos",
				"mob","argo","fiorino","ducato"};
		
		for (int i = 0; i < listaCarro.length; i++) {
			if (carro.equalsIgnoreCase(listaCarro[i])) {
				return true;

			}
		}
		return false;

	}

}
