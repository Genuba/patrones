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
 * <h1>PhoneNumber</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public abstract class PhoneNumber {
	
	private String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		try {
			Long.parseLong(phoneNumber);
			this.phoneNumber = phoneNumber;
		}catch(NumberFormatException e){
			
		}
	}
	
	public abstract String getCountryCode();
	
}
