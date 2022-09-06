package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Enterprise;
import com.prueba.model.Profile;
import com.prueba.service.interfaces.IEnterpriseService;
import com.prueba.service.interfaces.IProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	private IProfileService service;
	
	@GetMapping
	public List<Profile> listar() throws Exception{
		return service.listar();
	}
	
	
	@GetMapping("/{id}")
	public Profile listarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Profile registrar(@RequestBody Profile p) throws Exception{
		return service.registrar(p);
	}
	
	@PutMapping("/{id}")
	public Profile modificar(@PathVariable("id") Integer id, @RequestBody Profile p) throws Exception{
		Profile pro = service.listarPorId(id);
		if(pro != null) {
			p.setId(id);
			return service.modificar(p);	
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
	
}
