package com.app.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.crud.model.Persona;

@Repository
public interface PersonaInterface extends CrudRepository<Persona, Integer> {
	
}
