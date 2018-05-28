/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package com.ada.abstract_factory;

/**
 *
 * <h1>USAddress</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class USAddress extends Address {

	private static final String COUNTRY = "UNITED STATES";
	private static final String COMA = ",";
	
	@Override
	public String getCountry() {return COUNTRY;}
	
	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() + COMA + SPACE + getRegion() + SPACE + getPostalCode() + EOL_STRING + COUNTRY + EOL_STRING;
	}
	
}
