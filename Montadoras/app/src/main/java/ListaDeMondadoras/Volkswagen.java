/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeMondadoras;


public class Volkswagen implements PadraoMontadoras {
	
	@Override
	public boolean buscarNomeMontadora(String carro) {
		String[] listaCarro = {"gol", "polo", "voyage","virtus","nivus",
				"t-cross","saveiro","amarok" };
		
		for (int i = 0; i < listaCarro.length; i++) {
			if (carro.equalsIgnoreCase(listaCarro[i])) {
				return true;
				
			}
			else {
				return false;
				
			}
		}
		return false;
		
	}
}
