package com.prueba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Enterprise;

public interface IEnterpriseRepo extends JpaRepository<Enterprise, Integer>{

}
