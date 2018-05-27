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
 * <h1>AddressFactory</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public interface AddressFactory {
	public Address createAddress();
	public PhoneNumber createPhoneNumber();
}
