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

import com.prueba.model.Employee;
import com.prueba.model.Enterprise;
import com.prueba.model.RoleName;
import com.prueba.model.Transaction;
import com.prueba.service.interfaces.IEmployeeService;
import com.prueba.service.interfaces.IEnterpriseService;
import com.prueba.service.interfaces.ITransactionService;

@Controller
public class TransactionFrontendController {

	@Autowired
	private ITransactionService service;
	
	@Autowired
	private IEnterpriseService serviceEnt;
	
	@Autowired
	private IEmployeeService serviceEmp;

	// Obtener transacion
		@GetMapping("/transactions")
		public String listar(Model model) throws Exception {
			List<Transaction> lista = service.listar();
			model.addAttribute("transactions", lista);
			return "transaction/listTransaction";
		}
		
	// Eliminar transacion
		@GetMapping("/transaction/delete")
		public String eliminar(@RequestParam("id") Integer id, Model model) throws Exception {
			service.eliminar(id);
			model.addAttribute("id", id);
			return "transaction/deleteTransaction";
		}
		
		
		// CREAR transacion
		@GetMapping("/transaction/create")
		public String crear() throws Exception {
			return "transaction/createTransaction";
		}
				
		@PostMapping("/transaction/save")
		public String guardar(@RequestParam("concept") String concept, @RequestParam("amount") Float amount,
							  @DateTimeFormat(pattern= "yyyy-MM-dd") Date createdAt,@DateTimeFormat(pattern= "yyyy-MM-dd") Date updatedAt,
							  @RequestParam("user") Integer user ,@RequestParam("enterprise") Integer enterprise) throws Exception {
			System.out.println("concept:" + concept);
			System.out.println("amount: " + amount);
			System.out.println("createdAt: " + createdAt);
			System.out.println("updatedAt: " + updatedAt);
			System.out.println("user: " + user);
			System.out.println("enterprise: " + enterprise);
			Enterprise ent = serviceEnt.listarPorId(enterprise);
			Employee emp = serviceEmp.listarPorId(user);
			Transaction tra = new Transaction( concept,  amount,  createdAt,  updatedAt,  emp, ent);
			service.registrar(tra);
			return "transaction/listTransaction";
			}
				
		//*********************************	
	
}
