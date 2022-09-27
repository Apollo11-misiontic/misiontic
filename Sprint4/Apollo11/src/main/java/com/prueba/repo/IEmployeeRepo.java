package com.prueba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{

}
