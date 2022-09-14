package com.prueba.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.prueba.model.Enterprise;
import com.prueba.service.interfaces.IEnterpriseService;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
	
	@Autowired
	private IEnterpriseService service;
	
	@GetMapping
	public List<Enterprise> listar() throws Exception{
		return service.listar();
	}
	
	
	@GetMapping("/{id}")
	public Enterprise listarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Enterprise registrar(@RequestBody Enterprise e) throws Exception{
		return service.registrar(e);
	}
	
	@PutMapping("/{id}")
	public Enterprise modificar(@PathVariable("id") Integer id, @RequestBody Enterprise e) throws Exception{
		Enterprise ent = service.listarPorId(id);
		if(ent != null) {
			e.setId(id);
			return service.modificar(e);	
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}	
	
	@PatchMapping("/actualizar/{id}")
	public void actualizar(@PathVariable("id") Integer id, @RequestBody Map<String,Object> objeto) throws Exception {
		service.actualizar(id, objeto);
	}
}
