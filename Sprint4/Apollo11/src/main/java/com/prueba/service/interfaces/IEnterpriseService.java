package com.prueba.service.interfaces;

import java.util.List;
import java.util.Map;

import com.prueba.model.Enterprise;

public interface IEnterpriseService {
	
	Enterprise registrar(Enterprise e) throws Exception;
	Enterprise modificar(Enterprise e) throws Exception;
	List<Enterprise> listar() throws Exception;
	Enterprise listarPorId(Integer id) throws Exception;
	void eliminar(Integer id) throws Exception;
	Enterprise actualizar(Integer id, Map<String,Object> objeto) throws Exception;
}
