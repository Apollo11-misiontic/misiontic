package com.prueba.controller;

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

import com.prueba.model.Enterprise;
import com.prueba.model.Transaction;
import com.prueba.service.interfaces.IEnterpriseService;
import com.prueba.service.interfaces.ITransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	private ITransactionService service;
	
	
	@GetMapping
	public List<Transaction> listar() throws Exception{
		return service.listar();
	}
	
	
	@GetMapping("/{id}")
	public Transaction listarPorId(@PathVariable("id") Integer id) throws Exception{
		return service.listarPorId(id);
	}
	
	@PostMapping
	public Transaction registrar(@RequestBody Transaction t) throws Exception{
		return service.registrar(t);
	}
	
	@PutMapping("/{id}")
	public Transaction modificar(@PathVariable("id") Integer id, @RequestBody Transaction t) throws Exception{
		Transaction tra = service.listarPorId(id);
		if(tra != null) {
			t.setId(id);
			return service.modificar(t);	
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
