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
 * <h1>USAdressFactory</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class USAdressFactory implements AddressFactory{

	@Override
	public Address createAddress() {
		return new USAddress();
	}

	@Override
	public PhoneNumber createPhoneNumber() {
		return  new USPhoneNumber();
	}
	
}
