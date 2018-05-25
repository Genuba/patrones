/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.ada.factoria;

/**
 *
 * <h1>Cliente</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class Cliente {
	/**
	 * Description
	 * JavaDoc
	*/
	public static void main(String[] arg) {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		String tipoMoto = "campo";
		int ruedas 		= 3;

		//Inicio logica
		Factoria myFactory = new FactoriaIMP();
		myFactory.crearMoto(tipoMoto, ruedas);
	}
	
	
	 
}
