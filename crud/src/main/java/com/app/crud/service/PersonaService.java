package com.app.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crud.interfaceService.PersonaInterfaceService;
import com.app.crud.interfaces.PersonaInterface;
import com.app.crud.model.Persona;

@Service
public class PersonaService implements PersonaInterfaceService {

	
	@Autowired
	private PersonaInterface personaInterface;
	
	
	
	@Override
	public Persona guardarP(Persona persona) {
		// TODO Auto-generated method stub
		return personaInterface.save(persona);
	}

	@Override
	public Persona findByID(int id) {
		// TODO Auto-generated method stub
		Optional<Persona> persona = personaInterface.findById(id);
        if (persona.isPresent()){
            return persona.get();
        }
        throw new RuntimeException("No existe ninguna persona");
	}

	@Override
	public void delete(int id) {
		personaInterface.deleteById(id);
		
	}

	@Override
	public List<Persona> listar() {
		// 
		return (List<Persona>) personaInterface.findAll();
	}

	@Override
	public Persona upsert(Persona persona) {
		return personaInterface.save(persona);
	}

}
