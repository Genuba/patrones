/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.ada.dependency_injection;

/**
 *
 * <h1>InjectionOP</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class InjectionOP {

	public static void main(String[] args) {
		/*
		* =======================
		* Declaracion de varibles 
		* =======================
		*/
		Crack masterZen = null;

		//Inicio logica
		masterZen = new Crack(new NissanGTR());
		masterZen.mostrarCarro();
		
		masterZen = new Crack(new Pagani());
		masterZen.mostrarCarro();
		
	}

}
