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
 * <h1>FactoriaIMP</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class FactoriaIMP implements Factoria{
	/*
	* =======================
	* Declaracion de varibles 
	* =======================
	*/
	public final static String AGUA = "agua";
	public final static String CAMPO = "campo";
	
	@Override
	public Moto crearMoto(String tipo, int ruedas) {
		
		
		//Inicio logica
		/*
		  * =====================================
		  * Este switch se encarga de retornar los
		  * objetos de tipo moto segun tipo de 
		  * moto
		  * =====================================
		*/
		switch (tipo) {
		case AGUA: return new MotoAgua();
		case CAMPO: return new MotoCampo();
		default: return null;
		}
	}
	
	public void mimetodo() {
		/*
		* =======================
		* Declaracion de varibles 
		* =======================
		*/

		//Inicio logica
		System.out.println("dentro de mi metodo");

	}
	
	
}
