package com.prueba.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prueba.model.Enterprise;
import com.prueba.service.interfaces.IEnterpriseService;

@Controller
public class EnterpriseFrontendController {
	
	@Autowired
	private IEnterpriseService service;

	
	// Obtener empresas
	@GetMapping("/enterprises")
	public String listar(Model model) throws Exception {
		List<Enterprise> lista = service.listar();
		model.addAttribute("enterprises", lista);
		return "enterprise/listEnterprise";
	}
	
	// Eliminar empresa
	//@DeleteMapping("/enterprise/delete/{id}")
	@GetMapping("/enterprise/delete")
	public String eliminar(@RequestParam("id") Integer id, Model model) throws Exception {
		service.eliminar(id);
		model.addAttribute("id", id);
		return "enterprise/deleteEnterprise";
	}
	
	//*********************************
	// CREAR EMPRESA
	@GetMapping("/enterprises/create")
	public String crear() throws Exception {
		return "enterprise/createEnterprise";
	}
	

	@PostMapping("/enterprise/save")
	public String guardar(@RequestParam("address") String address,@DateTimeFormat(pattern= "yyyy-MM-dd") Date createdAt,
						  @RequestParam("document") String document, @RequestParam("name") String name,
						  @RequestParam("phone") String phone,@DateTimeFormat(pattern= "yyyy-MM-dd") Date updatedAt) throws Exception {
		System.out.println("address:" + address);
		System.out.println("createdAt: " + createdAt);
		System.out.println("document: " + document);
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		System.out.println("updatedAt: " + updatedAt);
		Enterprise ent = new Enterprise(name, document, phone, address, createdAt, updatedAt);
		service.registrar(ent);
		return "enterprise/listEnterprise";
		}
	
	//*********************************

}
