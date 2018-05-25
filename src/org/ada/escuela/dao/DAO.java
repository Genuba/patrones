/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.ada.escuela.dao;

import java.util.List;

/**
 *
 * <h1>DAO</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public interface DAO <T , L>{	
	
	public List<T> obtenerListado();
	
	public void modificar(T a);
	
	public void eliminar(T a);
	
	public T obtener(L id);
}
