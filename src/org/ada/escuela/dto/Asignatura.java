/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.ada.escuela.dto;

/**
 *
 * <h1>Asignatura</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class Asignatura {

	private Long id = null;
	private String nombre;
	private Long idProfesor;
	
	public Asignatura(String nombre,Long idProfesor) {
		this.nombre = nombre;
		this.idProfesor = idProfesor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
