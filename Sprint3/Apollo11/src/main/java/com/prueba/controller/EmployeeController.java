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

import com.prueba.model.Employee;
import com.prueba.service.interfaces.IEmployeeService;

@RestController
@RequestMapping("/empleyee")
public class EmployeeController {


	@Autowired
	private IEmployeeService service;
	
	@GetMapping
	public List<Employee> listar() throws Exception{
		return service.listar();
	}
	
	
	@GetMapping("/{id}")
	public Employee listarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Employee registrar(@RequestBody Employee e) throws Exception{
		return service.registrar(e);
	}
	
	@PutMapping("/{id}")
	public Employee modificar(@PathVariable("id") Integer id, @RequestBody Employee e) throws Exception{
		Employee emp = service.listarPorId(id);
		if(emp != null) {
			e.setId(id);
			return service.modificar(e);	
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
	}
}
