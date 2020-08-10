package com.app.crud.interfaceService;

import java.util.List;

import com.app.crud.model.Persona;

public interface PersonaInterfaceService {
	
	Persona guardarP(Persona persona);
	Persona findByID (int id);
	Persona upsert (Persona persona);
	public List<Persona>listar();
	public void delete (int id);
}
