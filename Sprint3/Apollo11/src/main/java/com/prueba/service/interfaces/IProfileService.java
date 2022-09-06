package com.prueba.service.interfaces;

import java.util.List;

import com.prueba.model.Profile;

public interface IProfileService {

	Profile registrar(Profile p) throws Exception;
	Profile modificar(Profile p) throws Exception;
	List<Profile> listar() throws Exception;
	Profile listarPorId(Integer id) throws Exception;
	void eliminar(Integer id) throws Exception;
}
