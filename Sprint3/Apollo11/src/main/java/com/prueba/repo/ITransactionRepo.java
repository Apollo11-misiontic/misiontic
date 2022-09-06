package com.prueba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Transaction;

public interface ITransactionRepo extends JpaRepository<Transaction, Integer>{

}
