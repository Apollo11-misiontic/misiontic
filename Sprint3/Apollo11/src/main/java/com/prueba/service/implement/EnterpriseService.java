package com.prueba.service.implement;

import java.util.List;
import java.util.Map;
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

	@Override
	public Enterprise actualizar(Integer id, Map<String, Object> objeto) throws Exception {
		// TODO Auto-generated method stub
		// traer enterprise
		Enterprise ent = listarPorId(id);
		for(String key: objeto.keySet()){
			if(key.equals("name")) {
				//System.out.println("recibo nombre");
				ent.setName(objeto.get(key).toString());
				//System.out.println(ent.getName());
			}
			else if(key.equals("document")) {
				//System.out.println("recibo document");
				ent.setDocument(objeto.get(key).toString());
				//System.out.println(ent.getDocument());
			}
			else if(key.equals("phone")) {
				//System.out.println("recibo phone");
				ent.setPhone(objeto.get(key).toString());
				//System.out.println(ent.getPhone());
			}
			else if(key.equals("address")) {
				//System.out.println("recibo addres");
				ent.setAddress(objeto.get(key).toString());
				//System.out.println(ent.getAddress());
			}
			else if(key.equals("createdAt")) {
				System.out.println("recibo createdAt");
				//ent.setCreatedAt(bjeto.get(key).toString());
				//System.out.println(ent.getAddress());
			}
			else if(key.equals("updatedAt")) {
				System.out.println("recibo updatedAt");
			}
			
			
		}
		return repo.save(ent);
	}

	
	
	
}
