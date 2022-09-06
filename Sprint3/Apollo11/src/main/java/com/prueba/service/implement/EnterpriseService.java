package com.prueba.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Enterprise;
import com.prueba.repo.IEnterpriseRepo;
import com.prueba.service.interfaces.IEnterpriseService;

@Service
public class EnterpriseService implements IEnterpriseService{

	@Autowired
	private IEnterpriseRepo repo;
	
	@Override
	public Enterprise registrar(Enterprise e) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public Enterprise modificar(Enterprise e) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public List<Enterprise> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Enterprise listarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Enterprise> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Enterprise();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
