package com.prueba.controller;

import java.util.ArrayList;
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
import com.prueba.service.interfaces.IEmployeeService;
import com.prueba.service.interfaces.IEnterpriseService;

@Controller
public class EmployeeFrontendController {

	@Autowired
	private IEmployeeService service;
	
	@Autowired
	private IEnterpriseService serviceEnt;
	
	@GetMapping("/employees")
	public String listar(Model model) throws Exception {
		List<Employee> lista = service.listar();
		model.addAttribute("employees", lista);
		return "employee/listEmployee";
	}
	
	@GetMapping("/employee/delete")
	public String eliminar(@RequestParam("id") Integer id, Model model) throws Exception {
		service.eliminar(id);
		model.addAttribute("id", id);
		return "employee/deleteEmployee";
	}
	
	//*********************************
		// CREAR Empleado
		@GetMapping("/employees/create")
		public String crear() throws Exception {
			return "employee/createEmployee";
		}
		

		@PostMapping("/employees/save")
		public String guardar(@RequestParam("email") String email, @RequestParam("role") Integer role,
							  @RequestParam("imagen") String imagen, @RequestParam("phone") String phone,
							  @DateTimeFormat(pattern= "yyyy-MM-dd") Date updatedAt,@DateTimeFormat(pattern= "yyyy-MM-dd") Date createdAt,
							  @RequestParam("enterprise") Integer enterprise) throws Exception {
			System.out.println("address:" + email);
			System.out.println("createdAt: " + role);
			System.out.println("document: " + imagen);
			System.out.println("name: " + phone);
			System.out.println("phone: " + updatedAt);
			System.out.println("updatedAt: " + createdAt);
			System.out.println("enterprise: " + enterprise);
			Enterprise ent = serviceEnt.listarPorId(enterprise);
			// validar RoleName
			RoleName rol = RoleName.Operario;
			if(role==0) {
				 rol = RoleName.Admin;
			}
			
			Employee emp = new Employee(email, imagen, phone, updatedAt, createdAt, rol, ent);
			service.registrar(emp);
			return "Employee/listEmployee";
			}
		
		//*********************************
	
	
	
}
