package com.app.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.crud.interfaceService.PersonaInterfaceService;
import com.app.crud.model.Persona;

@RestController
@RequestMapping("/Persona")

public class PersonaController {
	
	
	@Autowired
	private PersonaInterfaceService personaInterfaceService;
	
	@GetMapping("listar")
    public List<Persona> listar() {
		return personaInterfaceService.listar();
		
    }
	
	@PutMapping("editar")
	public Persona upsert(@RequestBody @Validated Persona persona) {
		personaInterfaceService.findByID(persona.getId());
		return personaInterfaceService.upsert(persona);
		
	}
	
	@PutMapping
	public Persona guardarP(@RequestBody @Validated Persona persona) {
		return personaInterfaceService.guardarP(persona);
	}
	
	@RequestMapping(value = "byID/{id}", method = RequestMethod.GET)
    public Persona findByID(@PathVariable Integer id) {
        return personaInterfaceService.findByID(id);
    }
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        personaInterfaceService.delete(id);
    	return personaInterfaceService.findByID(id)+"\nPersona Borrada";
	}
	
}
