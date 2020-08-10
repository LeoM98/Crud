package com.app.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persona")//Nombre de la base de datos
public class Persona {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Se hace referencia a la variable id en la tabla persona
	private int id;
	private String nombre;
	private String ciudad;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String nombre, String ciudad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
}
