/*
 * MIT License 
 * 
 * Copyright (c) 2018 ADA
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package com.ada.builder;

/**
 *
 * <h1>InformationRequiredException</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class InformationRequiredException extends Exception {
	InformationRequiredException(int e){
		System.out.println("Excepcion faltan argumentos nivel: "+e);
	}
}
