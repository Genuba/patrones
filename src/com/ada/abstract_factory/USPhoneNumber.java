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
 * <h1>USPhoneNumber</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class USPhoneNumber extends PhoneNumber {
	private static final String COUNTRY_CODE = "01";
	private static final int NUMBER_LENGTH = 10;
	
	@Override
	public String getCountryCode() {return COUNTRY_CODE;}
	
	public void setPhonrNumber(String newNumber) {
		if(newNumber.length() == NUMBER_LENGTH) {
			super.setPhoneNumber(newNumber);
		}
	}

}
