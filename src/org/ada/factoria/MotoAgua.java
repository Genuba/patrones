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
 * <h1>MotoAgua</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class MotoAgua implements Moto{

	private int ruedas;
	
	public void Moto(int ruedas){
		this.ruedas = ruedas;
	}

	@Override
	public int getRuedas() {
		/*
		* =======================
		* Declaracion de varibles 
		* =======================
		*/
		
		
		//Inicio logica
		return this.ruedas;
	}

}
