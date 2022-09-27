package com.prueba.service.implement;

import java.util.List;
import java.util.Map;
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

	@Override
	public Employee actualizar(Integer id, Map<String, Object> objeto) throws Exception {
		// TODO Auto-generated method stub
		Employee emp = listarPorId(id);
		for(String key: objeto.keySet()){
			if(key.equals("email")) {
				//System.out.println("recibo email");
				emp.setEmail(objeto.get(key).toString());
				//System.out.println(emp.getEmail());
			}
			else if(key.equals("imagen")) {
				//System.out.println("recibo imagen ");
				emp.setImagen(objeto.get(key).toString());
				//System.out.println(emp.getImagen());
			}
			else if(key.equals("phone")) {
				//System.out.println("recibo phone ");
				emp.setPhone(objeto.get(key).toString());
				//System.out.println(emp.getPhone());
			}
			else if(key.equals("createdAt")) {
				//System.out.println("recibo createdAt");
				//ent.setCreatedAt(bjeto.get(key).toString());
				//System.out.println(ent.getAddress());
			}
			else if(key.equals("updatedAt")) {
				//System.out.println("recibo updatedAt");
				//ent.setCreatedAt(bjeto.get(key).toString());
				//System.out.println(ent.getAddress());
			}
			
		}
		return repo.save(emp);
	}
	
}
