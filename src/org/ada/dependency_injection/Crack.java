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
 * <h1>Crack</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class Crack {
	private Carro carro;
	
	public Crack(Carro carro){
		this.carro = carro;
	}
	
	public void mostrarCarro() {
		carro.mostrar();
	}
}
