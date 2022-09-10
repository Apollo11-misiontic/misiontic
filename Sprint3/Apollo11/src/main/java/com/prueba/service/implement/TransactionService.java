package com.prueba.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Transaction;
import com.prueba.repo.ITransactionRepo;
import com.prueba.service.interfaces.ITransactionService;

@Service
public class TransactionService implements ITransactionService{

	@Autowired
	private ITransactionRepo repo;
	
	@Override
	public Transaction registrar(Transaction t) throws Exception {
		// TODO Auto-generated method stub
		// Validar que venga un usuario o una empresa
		return repo.save(t);
	}

	@Override
	public Transaction modificar(Transaction t) throws Exception {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public List<Transaction> listar() throws Exception {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Transaction listarPorId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Transaction> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Transaction();
	}

	@Override
	public void eliminar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	
}
