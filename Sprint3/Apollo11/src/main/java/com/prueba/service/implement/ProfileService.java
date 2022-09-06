package com.prueba.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Profile;
import com.prueba.model.Transaction;
import com.prueba.repo.IProfileRepo;
import com.prueba.service.interfaces.IProfileService;


@Service
public class ProfileService implements IProfileService{

	@Autowired
	private IProfileRepo repo;

	@Override
	public Profile registrar(Profile p) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Profile modificar(Profile p) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public List<Profile> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Profile listarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Profile> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Profile();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	
	
}
