package com.prueba.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Employee;
import com.prueba.repo.IEmployeeRepo;
import com.prueba.service.interfaces.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public Employee registrar(Employee e) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public Employee modificar(Employee e) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public List<Employee> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee listarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Employee> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Employee();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
}
