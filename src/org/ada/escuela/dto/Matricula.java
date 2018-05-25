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
 * <h1>Matricula</h1>
 *
 * Description
 *
 * @author Master-Zen (ADA) 
 * @version 1.0
 * 
 */
public class Matricula {
	private long alumno;
	private long asignatura;
	private int year;
	private Integer nota = null;
	
	public Matricula(long alumno,long asignatura,int year) {
		this.alumno = alumno;
		this.asignatura = asignatura;
		this.year = year;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
}
