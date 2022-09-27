package com.prueba.service.interfaces;

import java.util.List;
import java.util.Map;

import com.prueba.model.Transaction;

public interface ITransactionService {
	Transaction registrar(Transaction t) throws Exception;
	Transaction modificar(Transaction t) throws Exception;
	List<Transaction> listar() throws Exception;
	Transaction listarPorId(Integer id) throws Exception;
	void eliminar(Integer id) throws Exception;
	Transaction actualizar(Integer id, Map<String,Object> objeto) throws Exception;
}
