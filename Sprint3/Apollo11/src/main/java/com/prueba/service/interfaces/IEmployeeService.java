package com.prueba.service.interfaces;

import java.util.List;

import com.prueba.model.Employee;

public interface IEmployeeService {
	
	Employee registrar(Employee e) throws Exception;
	Employee modificar(Employee e) throws Exception;
	List<Employee> listar() throws Exception;
	Employee listarPorId(Integer id) throws Exception;
	void eliminar(Integer id) throws Exception;
}
